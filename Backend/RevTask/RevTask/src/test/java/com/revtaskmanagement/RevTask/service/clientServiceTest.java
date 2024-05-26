package com.revtaskmanagement.RevTask.service;


import com.revtaskmanagement.RevTask.DTO.ClientDTO;
import com.revtaskmanagement.RevTask.Entity.Client;
import com.revtaskmanagement.RevTask.Repository.ClientRepository;
import com.revtaskmanagement.RevTask.Service.ClientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class clientServiceTest {
    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAllClients() {
        // Arrange
        List<ClientDTO> clients = new ArrayList<>();
        clients.add(new Client(1L, "Client 1", "client1@example.com",  null));
        clients.add(new Client(2L, "Client 2", "client2@example.com", null));
        when(clientRepository.findallclientDTO()).thenReturn(clients);

        // Act
        List<ClientDTO> result = clientService.getAllClients();

        // Assert
        assertEquals(2, result.size());
    }

    @Test
    void testGetClientById() {
        // Arrange
        ClientDTO client = new Client(1L, "Client 1", "client1@example.com",null);
        when(clientRepository.findClientDTOById(1L)).thenReturn(client);

        // Act
        ClientDTO result = clientService.getClientById(1L);

        // Assert
        assertEquals(client, result);
    }

    @Test
    void testCreateClient() {
        // Arrange
        Client client = new Client(1L, "Client 1", "client1@example.com", null);
        when(clientRepository.save(client)).thenReturn(client);

        // Act
        Client result = clientService.createClient(client);

        // Assert
        assertEquals(client, result);
    }

    @Test
    void testDeleteClient() {
        // Arrange
        long clientId = 1L;

        // Act
        boolean result = clientService.deleteClient(clientId);

        // Assert
        assertEquals(true, result);
        verify(clientRepository, times(1)).deleteById(clientId);
    }
}

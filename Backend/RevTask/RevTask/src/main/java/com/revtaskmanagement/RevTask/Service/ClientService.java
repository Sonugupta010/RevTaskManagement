package com.revtaskmanagement.RevTask.Service;

import com.revtaskmanagement.RevTask.DTO.ClientDTO;
import com.revtaskmanagement.RevTask.Entity.Client;
import com.revtaskmanagement.RevTask.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientDTO> getAllClients() {

        return clientRepository.findallclientDTO();
    }

    public ClientDTO getClientById(Long id) {

        return clientRepository.findClientDTOById(id);
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client clientDetails) {
        Client client = clientRepository.findById(id).orElseThrow();
        client.setName(clientDetails.getName());
        client.setEmail(clientDetails.getEmail());
        return clientRepository.save(client);
    }

    public boolean deleteClient(Long id) {
        clientRepository.deleteById(id);
        return true;
    }
}

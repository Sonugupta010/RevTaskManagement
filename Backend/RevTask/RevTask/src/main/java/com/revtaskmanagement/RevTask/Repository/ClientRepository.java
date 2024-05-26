package com.revtaskmanagement.RevTask.Repository;

import com.revtaskmanagement.RevTask.DTO.ClientDTO;
import com.revtaskmanagement.RevTask.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT new com.revtaskmanagement.RevTask.DTO.ClientDTO(c.id, c.name, c.email) from Client c")
    List<ClientDTO> findallclientDTO();

    @Query("SELECT new com.revtaskmanagement.RevTask.DTO.ClientDTO(c.id, c.name, c.email) FROM Client c WHERE c.id = :clientId")
    ClientDTO findClientDTOById(@Param("clientId") Long clientId);


}

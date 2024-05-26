package com.revtaskmanagement.RevTask.Controller;

import com.revtaskmanagement.RevTask.DTO.ClientDTO;
import com.revtaskmanagement.RevTask.Entity.Client;
import com.revtaskmanagement.RevTask.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getAllClients() {

//        return clientService.getAllClients();
        List<ClientDTO> client = clientService.getAllClients();
        if(client==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(client, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable Long id) {

//        return clientService.getClientById(id);
        ClientDTO client = clientService.getClientById(id);
        if(client == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(client,HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {

//        return clientService.createClient(client);
        Client createdclient = clientService.createClient(client);
        return new ResponseEntity<>(createdclient, HttpStatus.CREATED);


    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client clientDetails) {
        return clientService.updateClient(id, clientDetails);
    }

//    @DeleteMapping("/{id}")
//    public void deleteClient(@PathVariable Long id) {
//        boolean deleted = clientService.deleteClient(id);
//        if(deleted) {
//            new ResponseEntity<>(HttpStatus.OK);
//        }
//        else{
//            new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//    }
}

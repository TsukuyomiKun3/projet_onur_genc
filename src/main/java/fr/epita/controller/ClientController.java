package fr.epita.controller;

import fr.epita.entity.Client;
import fr.epita.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService service;

    @GetMapping("/clients")
    List<Client> getClients() {
        return service.getClients();
    }

    @PostMapping("/clients")
    Client createClient(@RequestBody Client client) {
        return service.createClient(client);
    }

    @GetMapping("/clients/{id}")
    ResponseEntity<Client> getClient(@PathVariable Long id) {
        return service.getClientById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/clients")
    Client updateClient(@RequestBody Client client) {
        return service.updateClient(client);
    }
}

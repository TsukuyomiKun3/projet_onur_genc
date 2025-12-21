package fr.epita.controller;

import fr.epita.entity.Client;
import fr.epita.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService service;

    @GetMapping("/clients")
    ResponseEntity<List<Client>> getClients() {
        return ResponseEntity.ok(service.getClients());
    }

    @PostMapping("/clients")
    ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client c = service.createClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    @GetMapping("/clients/{id}")
    ResponseEntity<Client> getClient(@PathVariable Long id) {
        return service.getClientById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/clients")
    ResponseEntity<Client> updateClient(@RequestBody Client client) {
        Client c = service.updateClient(client);
        return ResponseEntity.ok(c);
    }

    @DeleteMapping("/clients/{id}")
    ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        service.deleteClient(id);

        return ResponseEntity.noContent().build();
    }
}

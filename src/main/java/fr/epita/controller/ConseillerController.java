package fr.epita.controller;

import fr.epita.entity.Conseiller;
import fr.epita.service.ConseillerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ConseillerController {
    private final ConseillerService service;

    @GetMapping("/conseillers")
    ResponseEntity<List<Conseiller>> getConseillers() {
        return ResponseEntity.ok(service.getConseillers());
    }

    @PostMapping("/conseillers")
    ResponseEntity<Conseiller> createConseiller(@RequestBody Conseiller conseiller) {
        Conseiller c = service.createConseiller(conseiller);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    @GetMapping("/conseillers/{id}")
    ResponseEntity<Conseiller> getConseiller(@PathVariable Long id) {
        return service.getConseillerById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/conseillers")
    ResponseEntity<Conseiller> updateConseiller(@RequestBody Conseiller conseiller) {
        Conseiller c = service.updateConseiller(conseiller);
        return ResponseEntity.ok(c);
    }

    @DeleteMapping("/conseillers/{id}")
    ResponseEntity<Void> deleteConseiller(@PathVariable Long id) {
        service.deleteConseiller(id);

        return ResponseEntity.noContent().build();
    }
}

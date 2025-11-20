package fr.epita.controller;

import fr.epita.entity.Conseiller;
import fr.epita.service.ConseillerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ConseillerController {
    private final ConseillerService service;

    @GetMapping("/conseillers")
    List<Conseiller> getConseillers() {
        return service.getConseillers();
    }

    @PostMapping("/conseillers")
    Conseiller createConseiller(@RequestBody Conseiller conseiller) {
        return service.createConseiller(conseiller);
    }

    @GetMapping("/conseillers/{id}")
    ResponseEntity<Conseiller> getConseiller(@PathVariable Long id) {
        return service.getConseillerById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/conseillers")
    Conseiller updateConseiller(@RequestBody Conseiller conseiller) {
        return service.updateConseiller(conseiller);
    }
}

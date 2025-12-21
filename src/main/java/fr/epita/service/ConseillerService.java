package fr.epita.service;

import fr.epita.entity.Conseiller;

import java.util.List;
import java.util.Optional;

public interface ConseillerService {

    List<Conseiller> getConseillers();
    Optional<Conseiller> getConseillerById(Long id);

    Conseiller createConseiller(Conseiller conseiller);
    Conseiller updateConseiller(Conseiller conseiller);
    void deleteConseiller(Long id);
}

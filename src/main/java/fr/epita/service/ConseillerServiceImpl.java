package fr.epita.service;

import fr.epita.entity.Client;
import fr.epita.entity.Conseiller;
import fr.epita.repository.ConseillerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConseillerServiceImpl implements ConseillerService {

    private final ConseillerRepository repo;

    @Override
    public List<Conseiller> getConseillers() {
        return repo.findAll();
    }

    @Override
    public Optional<Conseiller> getConseillerById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Conseiller createConseiller(Conseiller conseiller) {
        return repo.save(conseiller);
    }

    @Override
    public Conseiller updateConseiller(Conseiller conseiller) {
        Optional<Conseiller> optionalConseiller = getConseillerById(conseiller.getId());
        System.out.println("Inside the function");

        if (optionalConseiller.isPresent()) {
            return repo.save(conseiller);
        } else {
            return null;
        }    }
}

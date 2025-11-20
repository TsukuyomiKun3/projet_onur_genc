package fr.epita.repository;

import fr.epita.entity.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, Integer> {
}

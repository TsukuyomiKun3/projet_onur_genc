package fr.epita.repository;

import fr.epita.entity.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteCourantRepository extends JpaRepository<CompteCourant, Integer> {
}

package fr.epita.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class CompteEpargne {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    CompteId compteId;

    private double tauxRemuneration = 3.0;
}

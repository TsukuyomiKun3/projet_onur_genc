package fr.epita.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class CompteCourant {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    CompteId compteId;

    @Getter
    @Setter
    private double decouvertMax = 1000.0;
}

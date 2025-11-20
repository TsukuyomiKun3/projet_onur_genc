package fr.epita.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class CompteId {
    private String nCompte;

    private double solde;

    private String dateOuverture;
}

package fr.epita.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;

    @ManyToOne
    private Conseiller conseiller;

/*    @OneToOne(cascade = CascadeType.ALL)
    private CompteCourant compteCourant = new CompteCourant();

    @OneToOne(cascade = CascadeType.ALL)
    private CompteEpargne compteEpargne = new CompteEpargne();*/
}

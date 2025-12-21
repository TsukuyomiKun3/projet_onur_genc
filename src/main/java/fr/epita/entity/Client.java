package fr.epita.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@Setter
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    @ManyToOne
    private Conseiller conseiller;

/*    @OneToOne(cascade = CascadeType.ALL)
    private CompteCourant compteCourant = new CompteCourant();

    @OneToOne(cascade = CascadeType.ALL)
    private CompteEpargne compteEpargne = new CompteEpargne();*/
}

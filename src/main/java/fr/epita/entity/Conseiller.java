package fr.epita.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Conseiller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "conseiller", fetch=FetchType.EAGER, cascade={CascadeType.PERSIST})
    private Set<Client> clients = new HashSet<Client>();

    public Conseiller(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}

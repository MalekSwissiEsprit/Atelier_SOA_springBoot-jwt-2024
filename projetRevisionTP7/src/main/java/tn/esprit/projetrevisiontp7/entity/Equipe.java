package tn.esprit.projetrevisiontp7.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  String nom ;
    private Domaine domaine ;
    //fetch ???  : ay relation tofa ...Many => taaml lazy loding
    //taficih y7ot eager 5ater par defaut lazy
    //t7otha f parent bch tjb list tforceha
    // obligatoire ki njib parent
    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private Set<Projet> projetSet =new HashSet<Projet>();
}

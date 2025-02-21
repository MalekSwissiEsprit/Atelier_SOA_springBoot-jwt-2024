package tn.esprit.projetrevisiontp7.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Projet {
    @Id
    // matanjmch maa string auto w zid lezmk tajouti manuelle id donc chaque ajout f base
    // @GeneratedValue(strategy = GenerationType.IDENTITY) matjich maa string
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String sujet ;

    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail ;

    //par defaut ki njib fils mch obligatoire n7ot eager
    @ManyToMany(mappedBy ="projetSet" , fetch = FetchType.EAGER )

    @ToString.Exclude
    @JsonIgnore // yaaml boucle yjib objet f west objet
    private Set<Equipe> equipeSet ;

}

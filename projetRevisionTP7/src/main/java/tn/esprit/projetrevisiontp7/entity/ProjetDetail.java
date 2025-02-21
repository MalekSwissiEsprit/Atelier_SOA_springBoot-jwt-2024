package tn.esprit.projetrevisiontp7.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    private  String description;
    private String technologie ;
    private long cout ;
    //@ temporel opetionnelle pour definir format date dans bd
    private Date dateDebut ;

    @OneToOne (mappedBy = "projetDetail")
    //nzid les 2 anootations 5ater fils
    @ToString.Exclude
    @JsonIgnore
    private Projet projet;
}

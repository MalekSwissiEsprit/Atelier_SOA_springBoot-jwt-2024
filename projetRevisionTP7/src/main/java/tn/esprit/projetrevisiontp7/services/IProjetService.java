package tn.esprit.projetrevisiontp7.services;

import tn.esprit.projetrevisiontp7.entity.Projet;
import tn.esprit.projetrevisiontp7.entity.ProjetDetail;

import java.util.List;

public interface IProjetService {
    public Projet addProjet(Projet projet);
    public List<Projet> getAllProjet();
    public Projet getProjetById(long id);
    public Projet updateProjet(Projet projet);
    public void deleteProjet(long id);
    public void assignProjetDetailToProjet(long projetId , long projetDetailId);

}

package tn.esprit.projetrevisiontp7.services;

import tn.esprit.projetrevisiontp7.entity.Equipe;
import tn.esprit.projetrevisiontp7.entity.Projet;

import java.util.List;

public interface IEquipeService {
    public Equipe addEquipe(Equipe equipe);
    public List<Equipe> getAllEquipe();
    public Equipe getEquipeById(long id);
    public Equipe updateEquipe(Equipe equipe);
    public void deleteEquipe(long id);
    public void assignProjetToEquipe(long projetId,long equipeId);
}

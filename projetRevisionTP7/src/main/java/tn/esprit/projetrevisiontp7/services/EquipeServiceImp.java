package tn.esprit.projetrevisiontp7.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projetrevisiontp7.entity.Equipe;
import tn.esprit.projetrevisiontp7.entity.Projet;
import tn.esprit.projetrevisiontp7.repository.EquipeRepository;
import tn.esprit.projetrevisiontp7.repository.ProjetDetailRepository;
import tn.esprit.projetrevisiontp7.repository.ProjetRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EquipeServiceImp implements IEquipeService {
    @Autowired
    private EquipeRepository equipeRepository;
    @Autowired
    private ProjetRepository projetRepository ;

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe getEquipeById(long id) {
        return equipeRepository.findById(id).orElse(null);

    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(long id) {
        equipeRepository.deleteById(id);

    }

    @Override
    public void assignProjetToEquipe(long projetId, long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
// on set le fils dans le parent :
        equipe.getProjetSet().add(projet);
        equipeRepository.save(equipe);
    }
}

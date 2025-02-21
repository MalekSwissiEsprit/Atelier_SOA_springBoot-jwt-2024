package tn.esprit.projetrevisiontp7.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projetrevisiontp7.entity.Projet;
import tn.esprit.projetrevisiontp7.entity.ProjetDetail;
import tn.esprit.projetrevisiontp7.repository.ProjetDetailRepository;
import tn.esprit.projetrevisiontp7.repository.ProjetRepository;

import java.util.List;
@Service
//@RequiredArgsConstructor + final
//@AllArgsConstructor sans autowired
public class ProjetServiceImp implements IProjetService {

    @Autowired
    private ProjetRepository projetRepository;
    @Autowired
    private ProjetDetailRepository projetDetailRepository;

    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public List<Projet> getAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet getProjetById(long id) {
        return projetRepository.findById(id).orElse(null);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet)
                ;
    }

    @Override
    public void deleteProjet(long id) {
     projetRepository.deleteById(id);
    }

    //affecter projet en projetDetail
    @Override
    public void assignProjetDetailToProjet(long projetId ,long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).orElse(null);
        //affecter projet en projetDetail
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }
}

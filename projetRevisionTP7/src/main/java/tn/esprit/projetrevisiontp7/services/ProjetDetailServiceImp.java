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
@RequiredArgsConstructor
public class ProjetDetailServiceImp implements IProjetDetailService{
    @Autowired
    private ProjetDetailRepository projetDetailRepository;

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<ProjetDetail> getAllProjetDetail() {
        return  projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail getProjetDetailById(long id) {
        return projetDetailRepository.findById(id).orElse(null);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail) {
        return  projetDetailRepository.save(projetDetail);
    }

    @Override
    public void deleteProjetDetail(long id) {
        projetDetailRepository.deleteById(id);

    }

}

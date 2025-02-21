package tn.esprit.projetrevisiontp7.services;

import tn.esprit.projetrevisiontp7.entity.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    public List<ProjetDetail> getAllProjetDetail();
    public ProjetDetail getProjetDetailById(long id);
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail);
    public void deleteProjetDetail(long id);

}

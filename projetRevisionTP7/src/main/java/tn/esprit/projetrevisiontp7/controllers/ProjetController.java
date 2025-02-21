package tn.esprit.projetrevisiontp7.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projetrevisiontp7.entity.Projet;
import tn.esprit.projetrevisiontp7.services.IProjetService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjetController {

    private IProjetService projetService;

    @PostMapping("/addProjet")
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.addProjet(projet);
    }
    @PutMapping("/updateProjet")
    public Projet updateProjet(@RequestBody Projet projet) {
        return projetService.updateProjet(projet);
    }
    @GetMapping("/getAllProjet")
    public List<Projet> getAllProjet() {
        return projetService.getAllProjet();
    }

    @GetMapping("/getProjetById/{id}")
    public Projet getProjetById(@PathVariable long id) {
        return projetService.getProjetById(id);

    }

    @DeleteMapping("/deleteProjetById/{id}")
    public void deleteProjetById(@PathVariable long id) {
        projetService.deleteProjet(id);
    }

    @PutMapping("/affecter-projet-a-projet-details/{projetId}/{projetDetailId}")
    public void assignProjetDetailToProjet(@PathVariable long projetId ,@PathVariable long projetDetailId) {
        projetService.assignProjetDetailToProjet(projetId, projetDetailId);
    }
}

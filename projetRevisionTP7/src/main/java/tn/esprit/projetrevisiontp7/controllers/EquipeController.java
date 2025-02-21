package tn.esprit.projetrevisiontp7.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projetrevisiontp7.entity.Equipe;
import tn.esprit.projetrevisiontp7.services.IEquipeService;

import java.util.List;
@RestController
@AllArgsConstructor
public class EquipeController {

    private IEquipeService equipeService;

    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    @GetMapping("/getAllEquipe")
    public List<Equipe> getAllEquipe() {
        return equipeService.getAllEquipe();
    }

    @GetMapping("/getEquipeById/{id}")
    public Equipe getEquipeById(@PathVariable long id) {
        return equipeService.getEquipeById(id);

    }

    @DeleteMapping("/deleteEquipeById/{id}")
    public void deleteEquipeById(@PathVariable long id) {
        equipeService.deleteEquipe(id);
    }

    @PutMapping("/affecter-projet-a-equipe/{projetId}/{equipeId}")
    public void assignProjetToEquipe(@PathVariable long projetId, @PathVariable long equipeId) {
        equipeService.assignProjetToEquipe(projetId, equipeId);
    }
}
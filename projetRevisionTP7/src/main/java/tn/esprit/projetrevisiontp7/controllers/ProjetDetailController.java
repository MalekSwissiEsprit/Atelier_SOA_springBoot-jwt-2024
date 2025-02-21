package tn.esprit.projetrevisiontp7.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projetrevisiontp7.entity.ProjetDetail;
import tn.esprit.projetrevisiontp7.services.IProjetDetailService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjetDetailController {

    private IProjetDetailService ProjetDetailService;

    @PostMapping("/addProjetDetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail ProjetDetail) {
        return ProjetDetailService.addProjetDetail(ProjetDetail);
    }

    @PutMapping("/updateProjetDetail")
    public ProjetDetail updateProjetDetail(@RequestBody ProjetDetail ProjetDetail) {
        return ProjetDetailService.updateProjetDetail(ProjetDetail);
    }

    @GetMapping("/getAllProjetDetail")
    public List<ProjetDetail> getAllProjetDetail() {
        return ProjetDetailService.getAllProjetDetail();
    }

    @GetMapping("/getProjetDetailById/{id}")
    public ProjetDetail getProjetDetailById(@PathVariable long id) {
        return ProjetDetailService.getProjetDetailById(id);

    }

    @DeleteMapping("/deleteProjetDetailById/{id}")
    public void deleteProjetDetailById(@PathVariable long id) {
        ProjetDetailService.deleteProjetDetail(id);
    }




}

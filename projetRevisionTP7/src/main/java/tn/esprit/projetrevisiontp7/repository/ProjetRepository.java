package tn.esprit.projetrevisiontp7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projetrevisiontp7.entity.Projet;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}

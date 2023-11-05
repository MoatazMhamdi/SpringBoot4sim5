package tn.esprit.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Etudiant;

import java.util.Date;
import java.util.List;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
    List<Etudiant> findByEcole(boolean estValide, String ecole, Date dateNaissance);
    List<Etudiant> findByCin(Long cin);
}

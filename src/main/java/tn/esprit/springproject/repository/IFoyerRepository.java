package tn.esprit.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Entity.Universite;

import java.util.List;
@Repository
public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
    List<Foyer> findByNomUniversite(String nomUniversite);
    List<Foyer> findByUniversite(Universite universite, long capaciteFoyer, String nomFoyer);
}

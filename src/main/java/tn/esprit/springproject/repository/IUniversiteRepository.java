package tn.esprit.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Entity.Universite;

import java.util.List;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
    List<Universite> findByNomUniversite(String nomUniversite);
    List<Universite> findByFoyerAndAdresse(Foyer foyer, String adresse);
}


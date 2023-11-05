package tn.esprit.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Etudiant;
import tn.esprit.springproject.Entity.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,String> {
    List<Reservation> findByEtudiants(Etudiant etudiant);
    List<Reservation> findByEtudiants(Etudiant etudiant, Date anneeUniversitaire);
}

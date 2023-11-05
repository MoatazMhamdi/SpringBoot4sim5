package tn.esprit.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Chambre;
import tn.esprit.springproject.Entity.TypeChambre;

import java.util.List;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {
    List<Chambre> findByTypeC(TypeChambre type);
    List<Chambre> findByReservationsEstValide(boolean estValide);
}

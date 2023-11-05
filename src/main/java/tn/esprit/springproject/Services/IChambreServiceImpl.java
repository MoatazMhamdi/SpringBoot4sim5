package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Chambre;
import tn.esprit.springproject.repository.IChambreRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IChambreServiceImpl implements IChambreService{
    private IChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambreById(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public List<Chambre> getAllChambre() {
        Iterable<Chambre> iterable = chambreRepository.findAll();
        List<Chambre> chambreList = new ArrayList<>();
        iterable.forEach(chambreList::add);
        return chambreList;
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambreById(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}


package tn.esprit.springproject.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.repository.IFoyerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IFoyerServiceImpl implements IFoyerService {
    private IFoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer getFoyerById(long idfoyer) {
        return foyerRepository.findById(idfoyer).get();
    }

    @Override
    public List<Foyer> getAllFoyer() {
        Iterable<Foyer> iterable = foyerRepository.findAll();
        List<Foyer> foyers = new ArrayList<>();
        iterable.forEach(foyers::add);
        return foyers;
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyerById(long idfoyer) {
        foyerRepository.deleteById(idfoyer);
    }
}

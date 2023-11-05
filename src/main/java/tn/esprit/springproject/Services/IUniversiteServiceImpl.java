package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Universite;
import tn.esprit.springproject.repository.IUniversiteRepository;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class IUniversiteServiceImpl implements IUniversiteService{
    private IUniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public List<Universite> getAllUniversite() {

        Iterable<Universite> iterable = universiteRepository.findAll();
        List<Universite> universites = new ArrayList<>();
        iterable.forEach(universites::add);
        return universites;
    }

    @Override
    public Universite updateFoyer(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversiteById(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}

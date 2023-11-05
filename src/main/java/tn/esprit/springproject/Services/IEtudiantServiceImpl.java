package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Etudiant;
import tn.esprit.springproject.repository.IEtudiantRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IEtudiantServiceImpl implements IEtudiantService {

    private IEtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiantById(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        Iterable<Etudiant> iterable = etudiantRepository.findAll();
        List<Etudiant> etudiants = new ArrayList<>();
        iterable.forEach(etudiants::add);
        return etudiants;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiantById(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
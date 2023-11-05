package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public Etudiant addEtudiant(Etudiant etudiant);

    public Etudiant getEtudiantById(long idEtudiant);

    public List<Etudiant> getAllEtudiant();

    public Etudiant updateEtudiant(Etudiant etudiant);

    public void deleteEtudiantById(long idEtudiant);

}


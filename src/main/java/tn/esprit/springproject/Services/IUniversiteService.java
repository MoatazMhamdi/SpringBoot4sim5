package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public Universite addUniversite(Universite universite);

    public Universite getUniversiteById(long idUniversite);

    public List<Universite> getAllUniversite();

    public Universite updateFoyer(Universite universite);

    public void deleteUniversiteById(long idUniversite);
}

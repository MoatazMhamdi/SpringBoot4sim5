package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);

    public Chambre getChambreById(long idChambre);

    public List<Chambre> getAllChambre();

    public Chambre updateChambre(Chambre chambre);

    public void deleteChambreById(long idChambre);
}

package tn.esprit.springproject.Services;

import tn.esprit.springproject.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);

    public Reservation getReservationById(String idReservation);

    public List<Reservation> getAllReservation();

    public Reservation updateFoyer(Reservation reservation);

    public void deleteReservationById(String idReservation);
}

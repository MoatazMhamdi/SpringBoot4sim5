package tn.esprit.springproject.Services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Reservation;
import tn.esprit.springproject.repository.IReservationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class IReservationServiceImpl implements IReservationService {

    private IReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public List<Reservation> getAllReservation() {

        Iterable<Reservation> iterable = reservationRepository.findAll();
        List<Reservation> reservations = new ArrayList<>();
        iterable.forEach(reservations::add);
        return reservations;
    }

    @Override
    public Reservation updateFoyer(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservationById(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}

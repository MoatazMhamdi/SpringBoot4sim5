package tn.esprit.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.Services.IReservationService;
import tn.esprit.springproject.Services.IUniversiteService;
import tn.esprit.springproject.repository.IReservationRepository;

@RestController
@AllArgsConstructor
public class ReservationController {
    @Autowired
    private IReservationService reservationService;
}

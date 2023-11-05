package tn.esprit.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.Services.IUniversiteService;

@RestController
@AllArgsConstructor
public class UniversiteController {
    @Autowired
    private IUniversiteService universiteService;
}

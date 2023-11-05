package tn.esprit.springproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.IBlocService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlocController {
    @Autowired
    private IBlocService blocService;
}



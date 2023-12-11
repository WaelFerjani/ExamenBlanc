package com.example.waelferjaniexblanc.controller;


import com.example.waelferjaniexblanc.entities.ClassPlace;
import com.example.waelferjaniexblanc.entities.Voyageur;
import com.example.waelferjaniexblanc.service.ExamenService;
import com.example.waelferjaniexblanc.service.IExamenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExamenController {

    IExamenService s;

    @PostMapping("addVoyageur")
    public List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs) {
        return s.ajouterVoyageurs(voyageurs);
    }

    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        return s.reserverVol(voyageurId, volId, classPlace);
    }
}

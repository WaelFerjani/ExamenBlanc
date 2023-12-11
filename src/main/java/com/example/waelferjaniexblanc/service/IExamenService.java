package com.example.waelferjaniexblanc.service;

import com.example.waelferjaniexblanc.entities.ClassPlace;
import com.example.waelferjaniexblanc.entities.Vol;
import com.example.waelferjaniexblanc.entities.Voyageur;

import java.util.List;

public interface IExamenService {
    String ajouterVolEtAeroport(Vol vol);

    List<Voyageur>ajouterVoyageurs(List<Voyageur>voyageurs);

    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);
    public void annulerReservation();
}

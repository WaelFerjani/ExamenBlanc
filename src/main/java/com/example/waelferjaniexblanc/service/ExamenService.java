package com.example.waelferjaniexblanc.service;

import com.example.waelferjaniexblanc.entities.*;
import com.example.waelferjaniexblanc.repositories.ReservationRepository;
import com.example.waelferjaniexblanc.repositories.VolRepository;
import com.example.waelferjaniexblanc.repositories.VoyageurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class ExamenService implements IExamenService {
   VoyageurRepository voy ;
   VolRepository vol ;
   ReservationRepository reservationRepository ;

    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        return null;
    }

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
       List<Voyageur>voyageurList= voy.findAll();
       for(Voyageur v:voyageurs){
           voyageurList.add(v);
       }
        voy.saveAll(voyageurList);
        return voyageurList;
    }

    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
      Voyageur voyageur= voy.findById(voyageurId).get();
      Vol vol=this.vol.findById(volId).get() ;
     return  "" ;

    }

    @Override
    @Scheduled(fixedRate =60000)
    public void annulerReservation() {
       List<Reservation>reservationList= reservationRepository.findAll();
       for(Reservation reservation:reservationList){
           if(reservation.getEtatReservation().equals(EtatReservation.ENCOURS)){
            //   if(LocalDate.now()-reservation.getVol().getDateDepart()) //if inferieur ou égal un jour
             //  {reservation.setIdReservation();}
           }
       }

    }



}

package com.example.waelferjaniexblanc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Reservation {
    @Id
    String idReservation ;
    LocalDate dateReservation ;
    ClassPlace classPlace ;
    EtatReservation etatReservation ;
    @ManyToOne
    Voyageur voyageur ;
    @ManyToOne
    Vol vol ;
}

package com.example.waelferjaniexblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVoyageur ;
    String nom ;
    String prenom ;
    Date datNaissance ;
    @OneToMany(cascade = CascadeType.ALL)
    List<Reservation> reservations= new ArrayList<>();



}

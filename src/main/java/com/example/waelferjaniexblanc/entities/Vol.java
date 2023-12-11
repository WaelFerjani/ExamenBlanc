package com.example.waelferjaniexblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
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
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol ;
    LocalDate dateDepart ;
    LocalDate dateArrive ;
    @ManyToOne

    Aeroport aeroportDepart ;

    @ManyToOne
    Aeroport aeroportArrive ;
    @OneToMany
    List<Reservation>reservations=new ArrayList<>() ;
}

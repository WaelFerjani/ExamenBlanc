package com.example.waelferjaniexblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAeroport ;
    String nom ;
    String codeAITA ;
    long telephone ;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "aeroportDepart")

    List<Vol>vols1=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "aeroportArrive")

    List<Vol>vols2=new ArrayList<>();






}

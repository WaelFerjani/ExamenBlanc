package com.example.waelferjaniexblanc.repositories;

import com.example.waelferjaniexblanc.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}

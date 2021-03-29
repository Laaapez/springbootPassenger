package com.airport.passenger.repository;

import com.airport.passenger.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {


    Passenger findByPassengerId(Long passengerId);

    Passenger deleteByPassengerId(Long passengerId);
}

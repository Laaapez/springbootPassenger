package com.airport.passenger.service;

import com.airport.passenger.entity.Passenger;
import com.airport.passenger.repository.PassengerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger savePassenger(Passenger passenger) {
        log.info("add a new Passenger with the save Passenger function");
        return passengerRepository.save(passenger);
    }

    public Passenger findByPassengerId(Long passengerId) {
        log.info("find a Passenger with the find Passenger function");
        return passengerRepository.findByPassengerId(passengerId);

    }

    public void deleteByPassengerId(Long passengerId) {
        passengerRepository.deleteById(passengerId);
    }
}

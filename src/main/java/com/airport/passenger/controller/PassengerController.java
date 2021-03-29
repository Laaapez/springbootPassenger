package com.airport.passenger.controller;

import com.airport.passenger.entity.Passenger;
import com.airport.passenger.service.PassengerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passengers")
@Slf4j
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/")
    public Passenger savePassenger(@RequestBody Passenger passenger){
        log.info("add a new Passenger with the save Passenger function");
        return passengerService.savePassenger(passenger);
    }

    @GetMapping("{id}")
    public Passenger findByPassengerId(@PathVariable("id") Long passengerId) {
        log.info("find a Passenger with the find Passenger function");
        return passengerService.findByPassengerId(passengerId);
    }

    @PutMapping("/")
    public Passenger updatePassenger(@RequestBody Passenger passenger) {
        log.info("add a new Passenger with the save Passenger function");
        return passengerService.savePassenger(passenger);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByPassengerId(@PathVariable("id") Long passengerId){
        log.info("delete a Passenger with the delete Passenger function");
        passengerService.deleteByPassengerId(passengerId);
    }


}

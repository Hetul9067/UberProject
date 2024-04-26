package com.aoop.uber.controller.passenger;

import com.aoop.uber.model.passenger.*;
import com.aoop.uber.service.passenger.PassengerRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger/signup")
public class RegisterController {

    @Autowired
    PassengerRegisterService passengerRegisterService;

    @PostMapping("create")
    public ResponseEntity<String> createAccount(@RequestBody PassengerRegister passengerRegister){




        return passengerRegisterService.createAccount(passengerRegister);
    }


    @GetMapping("allThePassengers")
    public ResponseEntity<List<Passenger>> getAllThePassengers(){
        return passengerRegisterService.getAllThePassengers();
    }


    @GetMapping("check")
    public String checklogin(){
        return "hello we are in ";
    }
}

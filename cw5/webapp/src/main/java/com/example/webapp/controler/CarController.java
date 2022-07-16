package com.example.webapp.controler;

import com.example.webapp.exceptions.CarExceptionNotFound;
import com.example.webapp.model.Car;
import com.example.webapp.services.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    CarService carService = new CarService();
    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable String id) throws CarExceptionNotFound {
        Car car = carService.getCarFromRepo(id);
        return new ResponseEntity<Car>(car,HttpStatus.OK);
    }



}

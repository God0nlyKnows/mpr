package com.example.webapp.services;

import java.util.HashMap;

import com.example.webapp.model.Car;

public class CarService {
    HashMap<String,Car> map = new HashMap<String,Car>();

    public CarService(){

        map.put("1", new Car("Panda","S",300));
        map.put("2", new Car("Seat","Model A",400));
        map.put("3", new Car("Fiat","Punto",500));

    }

    public Car getCar(String Id){
        return map.get(Id);
    }

    public Car getCarFromRepo(String id) {
        return map.get(id);
    }
}

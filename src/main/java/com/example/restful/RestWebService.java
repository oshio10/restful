package com.example.restful;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestWebService {

    @GetMapping("/cars")
    public List<Car> getCars(){
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car = new Car();
        car.setPlateNumber("AA11BB");
        cars.add(car);
        return cars;
    }

    @PostMapping("/cars")
    public void louer(@RequestBody Car car) {
        System.out.println(car);
    }

}

package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        //передаем обьект list = List<Car> в модель
        model.addAttribute("list", carService.carsCount( allCars));
        return "cars";
    }
}
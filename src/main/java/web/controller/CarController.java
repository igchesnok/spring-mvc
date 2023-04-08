package web.controller;


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

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        //создаем объект для загрузки в модель
        List<Car> list = new ArrayList<>();
        list.add(new Car("УАЗ", "КРАCНЫЙ", "1000"));
        list.add(new Car("Ferrari", "ЖЕЛТЫЙ", "700"));
        list.add(new Car("ВАЗ", "ЧЕРНЫЙ", "2007"));
        list.add(new Car("FIAT", "ГОЛУБОЙ", "180"));
        list.add(new Car("BMW", "СЕРЫЙ", "100"));
        //редактируем объект с учетом запроса
        list = CarService.carsCount(list, allCars);
        //передаем обьект list = List<Car> в модель
        model.addAttribute("list", list);
        return "cars";

    }
}
package web.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService {

    //создаем объект для загрузки в модель
    private  List<Car> list ;
    public CarService() {
        list = new ArrayList<>();
        list.add(new Car("УАЗ", "КРАCНЫЙ", "1000"));
        list.add(new Car("Ferrari", "ЖЕЛТЫЙ", "700"));
        list.add(new Car("ВАЗ", "ЧЕРНЫЙ", "2007"));
        list.add(new Car("FIAT", "ГОЛУБОЙ", "180"));
        list.add(new Car("BMW", "СЕРЫЙ", "100"));
    }

    public  List<Car> carsCount(int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}

package java8.services.impl;

import java8.classes.Car;
import java8.classes.Person;
import java8.services.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public String createCar(List<Car> cars) {
        return null;
    }

    @Override
    public String removeCar(String name, List<Car> cars) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public List<Person> findByCarName(String name, List<Person> people) {
        return null;
    }

    @Override
    public List<Car> findByCountry(String name, List<Person> persons) {
        return null;
    }
}

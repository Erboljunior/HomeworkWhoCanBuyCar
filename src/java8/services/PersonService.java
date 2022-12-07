package java8.services;

import java8.classes.Car;
import java8.classes.Person;

import java.util.Comparator;
import java.util.List;

public interface PersonService {
    String createPerson(List<Person> people);

    String removePerson(String name, List<Person> people);

    List<Person> getAll();

    List<Person> findByName(String name, List<Person> people);


    String payCars(String name, List<Person> person, String carName, List<Car> cars);



    List<Person> sortPersonDateOfBirth(int num, List<Person> persons);



    List<Person>sortGender(List<Person>person);

    int getAge(Person person);
}

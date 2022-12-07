package java8.services.impl;

import java8.classes.Car;
import java8.classes.Person;
import java8.services.PersonService;

import java.util.*;

public class PersonServiceImpl implements PersonService {
    List<Person> people = new ArrayList<>();


    @Override
    public String createPerson(List<Person> people) {
        this.people.addAll(people);
        return "People created successfully";
    }

    @Override
    public String removePerson(String name, List<Person> people) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getName().equals(name)) {
                iterator.remove();
                return "succusfully removed";
            }
        }
        return "failed invalid remove";
    }

    @Override
    public List<Person> getAll() {
        return this.people;
    }

    @Override
    public List<Person> findByName(String name, List<Person> people) {
        List<Person>person1 = new ArrayList<>();
        for (Person pe:people) {
           if(pe.getName().equals(name.toLowerCase())) {
               return person1;
           }
           }

        return null;
    }

    @Override
    public String payCars(String name, List<Person> person, String carName, List<Car> cars) {
        for (Person person1 : person) {
            if (person1.getName().equals(name)){
                for (Car car : cars) {
                    if(car.getName().equals(carName)){
                        int rezult = person1.getMoney().compareTo(car.getPrice());
                        if(rezult == 1){
                            person1.setMoney(person1.getMoney().subtract(car.getPrice()));
                            person1.getCars().add(car);
                            cars.remove(car);
                            return "ВЫ КУПИЛИ МАШИНУ ПОЗДРАВЛЯЮ!!! \n"+person1;
                        }else if (rezult<0){
                            return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ!";
                        }else {
                            return "error";
                        }
                    }
                }
            }

        }

        return null;
    }



    public Comparator<Person>sortPersonDateOfBirthsort1 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        }
    };
    public Comparator<Person>sortPersonDateOfBirthsort2 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getDateOfBirth().compareTo(o1.getDateOfBirth());
        }
    };

    @Override
    public List<Person> sortPersonDateOfBirth(int num, List<Person> persons) {
        List <Person> kk = new ArrayList<>();
        kk.addAll(persons);
        if (num==1){
            kk.sort(sortPersonDateOfBirthsort1);
        }else if (num==2){
            kk.sort(sortPersonDateOfBirthsort2);
        }
        return kk;
    }


    public Comparator<Person>sortPersonNamesort1 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public Comparator<Person>sortPersonNamesort2 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };




    @Override
    public List<Person> sortGender(List<Person> person) {
        return null;
    }


    @Override
    public int getAge(Person person) {
        return 0;
    }
}

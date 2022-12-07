import java8.classes.Car;
import java8.classes.Person;
import java8.enums.Colour;
import java8.enums.Country;
import java8.enums.Gender;
import java8.services.PersonService;
import java8.services.impl.PersonServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Camry 70", "Toyota", BigDecimal.valueOf(20000),
                Year.of(2018), Colour.BLACK, Country.JAPAN);
        Car car2 = new Car("Lexus 570", "Lexus", BigDecimal.valueOf(23000),
                Year.of(2011), Colour.WHITE, Country.USA);
        Car car3 = new Car("Legacy", "Subaru", BigDecimal.valueOf(27000),
                Year.of(2007), Colour.ORANGE, Country.JAPAN);
        Car car4 = new Car("Matiz", "Chevrolet", BigDecimal.valueOf(7000),
                Year.of(1997), Colour.WHITE, Country.KOREA);
        Car car5 = new Car("Accord", "Honda", BigDecimal.valueOf(17000),
                Year.of(2000), Colour.BLUE, Country.GERMANY);
        Car car6 = new Car("Fit", "Honda", BigDecimal.valueOf(13000),
                Year.of(2000), Colour.RED, Country.JAPAN);
        Car car7 = new Car("Highlander", "Toyota", BigDecimal.valueOf(31000),
                Year.of(2000), Colour.WHITE, Country.UK);
        Car car8 = new Car("Lexus 330", "Toyota", BigDecimal.valueOf(19000),
                Year.of(2000), Colour.BLACK, Country.USA);


        Person person1 = new Person("Bula", LocalDate.of(2000, 2, 21),
                Gender.MALE, BigDecimal.valueOf(33000), "0707134263", new ArrayList<>(List.of()));
        Person person2 = new Person("Serjan", LocalDate.of(1993, 5, 13),
                Gender.MALE, BigDecimal.valueOf(23000), "0992137288", new ArrayList<>(List.of()));
        Person person3 = new Person("Erjan", LocalDate.of(2002, 7, 26),
                Gender.MALE, BigDecimal.valueOf(14000), "0777380942", new ArrayList<>(List.of()));
        Person person4 = new Person("Berik", LocalDate.of(1999, 11, 5),
                Gender.MALE, BigDecimal.valueOf(19000), "0558891878", new ArrayList<>(List.of()));
        Person person5 = new Person("Manka", LocalDate.of(2001, 3, 11),
                Gender.MALE, BigDecimal.valueOf(10000), "0708244515", new ArrayList<>(List.of()));
        Person person6 = new Person("Sakura", LocalDate.of(1995, 10, 8),
                Gender.MALE, BigDecimal.valueOf(26000), "0557527770", new ArrayList<>(List.of()));


        PersonServiceImpl personService = new PersonServiceImpl();
        List<Person> people = new ArrayList<>(List.of(person1, person2, person3, person4, person5, person6));
        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4, car5, car6, car7, car8));
        Scanner scanner = new Scanner(System.in);
        System.out.println(personService.createPerson(people));


            System.out.println("""
                    1 - to get all people
                    2 - to remove person
                    3 - to find by Person's name
                    4 - to buy car
                    5 - to sort by birthday of people
                    6 - to sort by names of people
                    7 - to sort by gender of people
                    8 - to get ages of all people
                    9 - to get all cars
                    10 - to find by car's name
                    11 - to remove car
                    12 - to find by car's country

                    """);

            switch (12) {
                case 1:
                    List<Person> all = personService.getAll();
                    for (Person person : all) {
                        person.getInfo();
                    }
                    break;
                case 2:
                    System.out.println("Name the person who you want to remove: ");
                    System.out.println(personService.removePerson(scanner.nextLine().toLowerCase(), people));
                    break;
                case 3:
                    System.out.println("Name the person who you want to check: ");
                    System.out.println(personService.findByName(scanner.nextLine().toLowerCase(), people));
                    break;
                case 4:

                    System.out.println(personService.payCars(scanner.nextLine(), people, scanner.nextLine(), cars));
                default:
                    System.out.println("ffff");
                    break;
            }

        }
    }


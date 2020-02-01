package pl.SecondDay11;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Zofia", "Nowak", "89021462127", LocalDate.of(1989, 02, 14));
        Person underagePerson = new Person("Kewin", "Nowak", "10250374471", LocalDate.of(2010, 05, 03));
        Person invalidBirthDatePerson = new Person("Marianna", "Nowak", "10250374473", LocalDate.of(1990, 05, 03));

        System.out.println(AgeValidator.isAdult(person));
        System.out.println(AgeValidator.isAdult(underagePerson));
        System.out.println(AgeValidator.isAdult(invalidBirthDatePerson));

        List<Person> listOfPeople = new ArrayList<Person>();
        listOfPeople.add(person);
        listOfPeople.add(underagePerson);
        listOfPeople.add(invalidBirthDatePerson);
        listOfPeople.add(person);

        System.out.println("This is list of people:");
        for (Person singlePerson : listOfPeople) {
            System.out.println(singlePerson);
        }


        Set<Person> setOfPeople = new HashSet<>();
        setOfPeople.add(person);
        setOfPeople.add(underagePerson);
        setOfPeople.add(invalidBirthDatePerson);
        setOfPeople.add(person);

        System.out.println("This is set of people:");
        for (Person singlePerson : setOfPeople) {
            System.out.println(singlePerson);
        }

        Map<String, Person> mapOfPeople = new HashMap<>();
        mapOfPeople.put(person.getPeselNumber(), person);
        mapOfPeople.put(underagePerson.getPeselNumber(), underagePerson);
        mapOfPeople.put(invalidBirthDatePerson.getPeselNumber(), invalidBirthDatePerson);
        mapOfPeople.put(person.getPeselNumber(), person);

        System.out.println("This is map of people:");
        for (Person singlePerson : mapOfPeople.values()) {
            System.out.println(singlePerson);
        }



    }
}

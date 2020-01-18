package pl.Day11;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Zofia", "Nowak", "89021462127", LocalDate.of(1989, 02, 14));
        Person underagePerson = new Person("Kewin", "Nowak", "10250374471", LocalDate.of(2010, 05, 03));
        Person invalidBirthDatePerson = new Person("Marianna", "Nowak", "10250374471", LocalDate.of(1990, 05, 03));

        System.out.println(AgeValidator.isAdult(person));
        System.out.println(AgeValidator.isAdult(underagePerson));
        System.out.println(AgeValidator.isAdult(invalidBirthDatePerson));


    }
}

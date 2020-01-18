package pl.Day11;

import java.time.LocalDate;

public class AgeValidator {
    public static boolean isAdult(Person person) {
        LocalDate today = LocalDate.now();
        LocalDate adultAge = today.minusYears(18);
        System.out.println(adultAge);
        if (person.getDateOfBirth().isAfter(adultAge)) {
            System.out.println("You are NOT ADULT!!! ACCESS DENIED!!!");
            return false;
        } else {
            System.out.println("You are ADULT! ACCESS GRANTED");
        }

        String peselNumber = person.getPeselNumber();
        LocalDate localDateFromPeselNumber;

        String yearAsString, monthAsString, dayAsString;
        yearAsString = peselNumber.substring(0, 2);
        monthAsString = peselNumber.substring(2, 4);
        dayAsString = peselNumber.substring(4, 6);
        Integer yearAsInt, monthAsInt, dayAsInt;
        yearAsInt = Integer.valueOf(yearAsString);
        monthAsInt = Integer.valueOf(monthAsString);
        dayAsInt = Integer.valueOf(dayAsString);

        if (monthAsInt > 12) {
            yearAsInt = yearAsInt + 2000;
            monthAsInt = monthAsInt - 20;
        } else {
            yearAsInt = yearAsInt + 1900;
        }

        localDateFromPeselNumber = LocalDate.of(yearAsInt, monthAsInt, dayAsInt);
        if (localDateFromPeselNumber.isAfter(adultAge)) {
            System.out.println("Pesel number was invalid, person underage");
            return false;
        }

return true;
        }

    }


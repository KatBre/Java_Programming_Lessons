package pl.FifthDay14.QuickSort;

import pl.FifthDay14.QuickSort.QuickSort;
import pl.SecondDay11.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class AppQuickSort {
    public static void main(String[] args) {


    }


    private static void quickSortTest(){
        int[] myTabOne = new int[]{3, 25, 645, 453, 5254, 4, 86, 145, 65, 84, 65, 854, 32, 1, 965, -95, 0};
        int[] myTabTwo = new int[]{3, 25525, 645, -453, 524, 15, 65, 844, 5, 84, 32, 1, 95, -95};
        System.out.println("Before quick sorting: ");
        System.out.println(Arrays.toString(myTabOne));
        QuickSort.sort(myTabOne);
        //Arrays.sort(myTabOne, 0, myTabOne.length);
        System.out.println("After quick sorting: ");
        System.out.println(Arrays.toString(myTabOne));
        System.out.println();
        System.out.println("Before quick sorting: ");
        System.out.println(Arrays.toString(myTabTwo));
        QuickSort.sort(myTabTwo);
        //Arrays.sort(myTabTwo, 0, myTabTwo.length);
        System.out.println("After quick sorting: ");
        System.out.println(Arrays.toString(myTabTwo));
    }
    private static void comparableTest(){
        Person personOne = new Person("Jurek", "Ogórek", "123", LocalDate.of(1988, 12, 5 ));
        Person personTwo = new Person("Marianna", "Kluska", "365", LocalDate.of(1965, 11, 23 ));
        Person personThree = new Person("Ann", "Smith", "654", LocalDate.of(1974, 10, 2 ));
        Person personFour = new Person("Caroline", "Koy", "987", LocalDate.of(1984, 9, 11 ));
        Person personFive = new Person("Big", "O", "145", LocalDate.of(1994, 8, 30 ));
        Person personSix = new Person("Gertruda", "Schmidt", "854", LocalDate.of(2001, 7, 26 ));
        Person personSeven = new Person("Jerzy", "Wiaderko", "745", LocalDate.of(2002, 3, 17 ));
        Person personEight = new Person("Ali", "Aziz", "258", null);
        Person[] people = {personOne, personTwo, personThree, personFour, personFive, personSix, personSeven, personEight};
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
//        System.out.println(personFour.compareTo(personFive));
//        Collections.sort();
    }

}

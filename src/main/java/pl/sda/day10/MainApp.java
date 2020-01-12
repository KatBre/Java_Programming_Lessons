package pl.sda.day10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();
        System.out.println(unitConverter.celsiusToFahrenheit(123));
        System.out.println(unitConverter.fahrenheitToCelsius(365));
        System.out.println(unitConverter.kilometersToMiles(4598));
        System.out.println(unitConverter.milesToKilometers(569));
        System.out.println(unitConverter.kilogramsToPounds(4.8));
        System.out.println(unitConverter.poundsToKilograms(9.4));


        Scanner scanner = new Scanner(System.in);
        System.out.println("This is program to converting units");
        System.out.println("If you want to convert Celsius degrees to Fahrenheit choose 1");
        System.out.println("If you want to convert Fahrenheit degrees to Celsius choose 2");
        System.out.println("If you want to convert kilometers to miles choose 3");
        System.out.println("If you want to convert miles to kilometers choose 4");
        System.out.println("If you want to convert kilograms to pounds choose 5");
        System.out.println("If you wa want to convert pounds to kilograms choose 6");
        System.out.println("If you want to close the program choose 0");


        int choice;
        do {
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("You choose to convert Celsius degrees to Fahrenheit. Give me Celsius degrees:");
                double degree = scanner.nextDouble();
                System.out.println("Your Celsius temperature is: " + degree + " It is the " + unitConverter.celsiusToFahrenheit(degree) + " Fahrenheit degrees.");
            } else if (choice == 2) {
                System.out.println("You choose to convert Fahrenheit degrees to Celsius. Give me Fahrenheit degrees:");
                double degree = scanner.nextDouble();
                System.out.println("Your Fahrenheit temperature is: " + degree + " It is the " + unitConverter.fahrenheitToCelsius(degree) + " Celsius degrees.");
            } else if (choice == 3) {
                System.out.println("You choose to convert kilometers to miles. Give me kilometers:");
                double kilometers = scanner.nextDouble();
                System.out.println("Your kilometers are: " + kilometers + " It is the " + unitConverter.kilometersToMiles(kilometers) + " miles.");
            } else if (choice == 4) {
                System.out.println("You choose to convert miles to kilometers. Give me miles:");
                double miles = scanner.nextDouble();
                System.out.println("Your miles are: " + miles + " It is the " + unitConverter.milesToKilometers(miles) + " kilometers.");
            } else if (choice == 5) {
                System.out.println("You choose to convert kilograms to pounds. Give me kilograms:");
                double kilograms = scanner.nextDouble();
                System.out.println("Your kilograms are: " + kilograms + " It is the " + unitConverter.kilogramsToPounds(kilograms) + " pounds.");
            } else if (choice == 6) {
                System.out.println("You choose to convert pounds to kilograms. Give me pounds:");
                double pounds = scanner.nextDouble();
                System.out.println("Your pounds are: " + pounds + " It is the " + unitConverter.kilogramsToPounds(pounds) + " kilograms.");
            } else if (choice == 0) {
                System.out.println("You close the program. Thank you.");
            } else {
                System.out.println("Choose the right number.");
            }
        } while (choice != 0);
    }
}


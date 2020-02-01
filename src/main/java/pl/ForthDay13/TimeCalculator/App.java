package pl.ForthDay13.TimeCalculator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws InterruptedException {
        LocalDate testFirst = LocalDate.of(2023, 12, 25);
        TimeCalculator.daysToChristmasEve(testFirst);
        LocalDate testSecond = LocalDate.of(2020, 11, 25);
        TimeCalculator.daysToChristmasEve(testSecond);
        LocalDate testThird = LocalDate.of(2057, 05, 30);
        TimeCalculator.daysToChristmasEve(testThird);
        LocalDate testFourth = LocalDate.of(2187, 12, 05);
        TimeCalculator.daysToChristmasEve(testFourth);
        TimeCalculator.minutesToEndOfClass();

        LocalDateTime dateTime = LocalDateTime.now();   //timestamp
        System.out.println(dateTime);
    }
}

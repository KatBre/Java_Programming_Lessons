package pl.ForthDay13;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate testFirst = LocalDate.of(2023, 12, 25);
        TimeCalculator.daysToChristmasEve(testFirst);
        LocalDate testSecond = LocalDate.of(2020, 11, 25);
        TimeCalculator.daysToChristmasEve(testSecond);
        LocalDate testThird = LocalDate.of(2057, 05, 30);
        TimeCalculator.daysToChristmasEve(testThird);
        LocalDate testFourth = LocalDate.of(2187, 12, 05);
        TimeCalculator.daysToChristmasEve(testFourth);

    }
}

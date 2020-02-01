package pl.ForthDay13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeCalculator {


    static LocalDate getDate() {
        return LocalDate.now();
    }

    public static void daysToChristmasEve(LocalDate today) {
        LocalDate christmasEve = LocalDate.of(today.getYear(), 12, 24);
        LocalDate nextChristmasEve = christmasEve;
        if (today.isAfter(christmasEve)) {
            nextChristmasEve = christmasEve.plusYears(1);
        }
        long daysToChristmasEve = ChronoUnit.DAYS.between(today, nextChristmasEve);
        System.out.println("It's just " + daysToChristmasEve + " to Christmas Eve!");
        if (daysToChristmasEve < 60) {
            System.out.println("Time to buy gifts!");
        }
        System.out.println();
    }
}



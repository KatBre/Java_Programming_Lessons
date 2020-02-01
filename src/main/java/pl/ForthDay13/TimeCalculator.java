package pl.ForthDay13;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeCalculator {


    static LocalDate getDate() {
        return LocalDate.now();
    }

    public static void daysToChristmasEve(LocalDate today) {
        LocalDate christmasEve = LocalDate.of(today.getYear(), 12, 24);
        LocalDate nextChristmasEve = christmasEve;
        if (today.isAfter(christmasEve)) {
            //if (today.getMonthValue() == 12 && today.getDayOfMonth() > 24) {
            nextChristmasEve = christmasEve.plusYears(1);
        }
        long daysToChristmasEve = ChronoUnit.DAYS.between(today, nextChristmasEve);
        System.out.println("It's just " + daysToChristmasEve + " to Christmas Eve!");
        if (daysToChristmasEve < 60) {
            System.out.println("Time to buy gifts!");
        }
        System.out.println();
    }

    public static void minutesToEndOfClass() throws InterruptedException {
        LocalTime classEnd = LocalTime.of(16, 00);
        LocalTime now = LocalTime.now();
        long minutes;
        long seconds;
        long nanos;
        do {
            now = LocalTime.now();
            minutes = ChronoUnit.MINUTES.between(now, classEnd);
            seconds = ChronoUnit.SECONDS.between(now, classEnd);
            nanos = ChronoUnit.NANOS.between(now, classEnd);
            System.out.println("There is " + minutes + " minutes left to the end of today class.");
            System.out.println("There is " + seconds + " seconds left to the end of today class.");
            System.out.println("There is " + nanos + " nanos left to the end of today class.");
            Thread.sleep(5000);
        }
        while (now.isBefore(classEnd));
    }
}



package pl.ForthDay13.AliveAnalyzingApp;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LifeSimulator {
    public static void simulate(List<Programmer> listOfProgrammers, int numberOfDays) {
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.println("Day: " + i);
            for (Programmer programmer : listOfProgrammers) {
                work(programmer);
                play(programmer);
                rest(programmer);
            }
        }
        Set<Programmer> aliveSet = new HashSet<>();
        Set<Programmer> notAliveSet = new HashSet<>();
        for (Programmer resultProgrammer : listOfProgrammers) {
            if (resultProgrammer.isAlive()) {
                aliveSet.add(resultProgrammer);
            } else {
                notAliveSet.add(resultProgrammer);
            }
        }
        System.out.println("Alive programmers: " + aliveSet);
        System.out.println("Not alive programmers: " +notAliveSet);
    }


    private static void work(Programmer programmer) {
        if (programmer.isAlive()) {
            System.out.println(programmer.getFirstName() + " " + programmer.getLastName() + " is working.");
            checkPulse(programmer, 10);
        }
    }


    private static void play(Programmer programmer) {
        if (programmer.isAlive()) {
            System.out.println(programmer.getFirstName() + " " + programmer.getLastName() + " is playing.");
            checkPulse(programmer, 20);
        }
    }

    private static void rest(Programmer programmer) {
        if (programmer.isAlive()) {
            System.out.println(programmer.getFirstName() + " " + programmer.getLastName() + " is resting.");
            checkPulse(programmer, 3);
        }
    }

    private static void checkPulse(Programmer programmer, int chanceToDie) {
        int randomNumber = new Random().nextInt(1000);
        if (randomNumber < chanceToDie) {
            programmer.setAlive(false);
            System.out.println(programmer.getFirstName() + " " + programmer.getLastName() + " is died. R.I.P. [*]");
        }
    }
}


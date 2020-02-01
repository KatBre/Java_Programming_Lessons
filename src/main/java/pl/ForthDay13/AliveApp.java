package pl.ForthDay13;

import java.util.ArrayList;
import java.util.List;

public class AliveApp {
    public static void main(String[] args) {
        List<Programmer> listOfProgrammers = new ArrayList<>();
        listOfProgrammers.add(new Programmer( "John", "Smith", Sex.MEN));
        listOfProgrammers.add(new Programmer( "Sebastian", "Kowalski", Sex.MEN));
        listOfProgrammers.add(new Programmer( "Ann", "Goodman", Sex.WOMEN));
        listOfProgrammers.add(new Programmer( "Abdullah", "Mohammed", Sex.MEN));
        listOfProgrammers.add(new Programmer( "Gertruda", "Schmidt", Sex.WOMEN));
        listOfProgrammers.add(new Programmer( "Pink", "Unicorn", Sex.OTHER));
        listOfProgrammers.add(new Programmer( "Jozin", "Z Bazin", Sex.MEN));
        listOfProgrammers.add(new Programmer( "Matrix", "Matrix", Sex.OTHER));

        LifeSimulator.simulate(listOfProgrammers, 100);

    }
}

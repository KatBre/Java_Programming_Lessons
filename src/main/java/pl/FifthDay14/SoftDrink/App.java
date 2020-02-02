package pl.FifthDay14.SoftDrink;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {

        SoftDrink[] softDrinks = {
                new SoftDrink("coffee", "Java Coffee Inc", 12.50),
                new SoftDrink("tea", "Assam Tea Company", 4.75),
                new SoftDrink("juice", "Sunny Fruit Inc", 10.20),
                new SoftDrink("water", "Pure Ocean Co", 2.99),
                new SoftDrink("milk", "Happy Cow Co", 8.80),
                new SoftDrink("motherInLawJuice", "Teściowa", Double.MAX_VALUE),
        };
        SoftDrink searchedSoftDrink = new SoftDrink("juice", "Sunny Fruit Inc", 10.20);
        int indexPosition = LinearSearchUtil.findFirstSoftDrink(searchedSoftDrink, softDrinks);
        System.out.println("Searched drink is on position: " + indexPosition);
    }
}

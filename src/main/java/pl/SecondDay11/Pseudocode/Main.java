package pl.SecondDay11.Pseudocode;

public class Main {
    public static void main(String[] args) {
        PseudocodeExcersiseImpl pseudocodeExcersise = new PseudocodeExcersiseImpl();
        int[] arrayOfNumbers = new int[] {2, 8, 46, 84, 236, 984, 1024, 45, -23};
        int result = pseudocodeExcersise.highestValue(arrayOfNumbers);
        System.out.println(result);
        boolean secondResult = pseudocodeExcersise.isNumberEven(arrayOfNumbers);
        System.out.println(secondResult);

    }
}

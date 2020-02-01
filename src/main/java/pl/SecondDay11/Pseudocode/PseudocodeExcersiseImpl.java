package pl.SecondDay11.Pseudocode;

public class PseudocodeExcersiseImpl {


    public int highestValue(int[] arrayOfNumbers) {
        int highest = arrayOfNumbers[0];
        for (int i : arrayOfNumbers) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;

    }


    public boolean isNumberEven(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                System.out.println("true");
            }
        }
        return true;
    }

    public int sumOfPositiveNumbers(int[] arrayOfNumbers) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] >= 0) {
                sum = sum + arrayOfNumbers[i];
                counter++;
            }
        }
        return (sum / counter);
    }
}

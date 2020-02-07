package pl.Homework;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
    public static void main(String[] args) {
        List<?> mixed = Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7);
        System.out.println(sum(mixed));

    }

    public static int sum(List<?> mixed) {
        int sum = 0;

        for (int i = 0; i < mixed.size(); i++) {

            sum += Integer.parseInt(String.valueOf(mixed.get(i)));
        }
        return sum;
    }
}

package pl.SixthDay15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class IntegerService {
    public static List<Integer> listOfIntegers = Arrays.asList(545, 654, -5454, 669, -587, 65, 2, 99, 105, -854, 62, 14987, 6547, 0, 658, 1457, -32, 12, 951, 3);

    public static Integer sumOfIntegers() {
        Integer sum = listOfIntegers.stream()
                .mapToInt(a -> a).sum();
        System.out.println(sum);
        return sum;
    }

    public static OptionalDouble averageOfIntegers() {
        OptionalDouble average = listOfIntegers.stream()
                .mapToInt(a -> a).average();
        return average;
    }

    public static void printStatistics(){
        int sum = listOfIntegers.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum of elements is: " + sum);
        OptionalDouble average = listOfIntegers.stream()
                .mapToInt(i -> i)
                .average();
        double averageAsDouble = average.getAsDouble();
        System.out.println("Average of elements is: " + Math.round(averageAsDouble));

    }


}

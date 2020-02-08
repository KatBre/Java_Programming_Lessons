package pl.SixthDay15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    private static final List<String> stringList = Arrays.asList("Hello", "Stefan", "Ala", "ma", "kota");
    private String firstWord = "Hello";
    private final String secondWord = "Hello2";

    public static void loopExample(){
        List<String> resultList = new ArrayList<>();
        for (String word : stringList) {
            if (word.length() > 3) {
                resultList.add(word);
            }
        }
        System.out.println(resultList);
    }

    public static void streamExample(){
        List<String> results = stringList.stream()
                .filter(word -> word.length() > 3)
                .collect(Collectors.toList());
        System.out.println(results);
    }

    public void changeString() {
        firstWord = "NO HELLO, I don't like you";
//        secondWord = "I don't like you"; //nie można przypisać nowej wartości, bo pierwsza jest final
    }

}

package pl.SixthDay15;

import java.util.OptionalDouble;

public class AppSix {
    public static void main(String[] args) {
        StreamsExamples.loopExample();
        StreamsExamples.streamExample();
        WordProvider.provide();
        WordProvider.streamWordsWithD(WordProvider.provide());
        WordProvider.streamWordsWithAAndFourLetters(WordProvider.provide());
        WordProvider.streamWordsWithAAndFourLetters(WordProvider.provide());
        WordProvider.changeFirstLetter(WordProvider.provide());
        IntegerService.sumOfIntegers();
        OptionalDouble averageOfIntegers = IntegerService.averageOfIntegers();
        System.out.println(averageOfIntegers.getAsDouble());
        IntegerService.printStatistics();
    }
}

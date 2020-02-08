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
        IntegerService.printAllStatistics();

        NameChecker checker = new NameChecker();
        System.out.println(checker.checkGender("Anna"));
        System.out.println(checker.checkGender("Jakub"));
        System.out.println(checker.checkGender("Unicorn"));
        System.out.println(checker.checkGenderOptionTwo("Julia"));
        System.out.println(checker.checkGenderOptionTwo("Antoni"));
        System.out.println(checker.checkGenderOptionTwo("Marian"));
        System.out.println(checker.checkGenderOptionTwo("Marianna"));
    }
}

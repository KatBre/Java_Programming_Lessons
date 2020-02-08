package pl.SixthDay15;

public class AppSix {
    public static void main(String[] args) {
        StreamsExamples.loopExample();
        StreamsExamples.streamExample();
        WordProvider.provide();
        WordProvider.streamWordsWithD(WordProvider.provide());
        WordProvider.streamWordsWithAAndFourLetters(WordProvider.provide());
        WordProvider.streamWordsWithAAndFourLetters(WordProvider.provide());
        WordProvider.changeFirstLetter(WordProvider.provide());
    }
}

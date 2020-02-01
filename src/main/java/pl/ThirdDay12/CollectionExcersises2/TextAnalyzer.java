package pl.ThirdDay12.CollectionExcersises2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {
    public static void main(String[] args) {
        String analyzedText = "hint when you want to make a variable in a class which implements the Serializable " +
                "interface In other words you can use it for a variable whose value you do not want to save See The " +
                "Complete Java MasterClass to learn about transient variables in Java";
        Map<Character, List<String>> mapOfWords = groupWordsByFirstCharacter(analyzedText);
        System.out.println(mapOfWords);

    }



    public static Map<Character, List<String>> groupWordsByFirstCharacter(String analyzedText) {
        Map<Character, List<String>> characterStringMap = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char letter: alphabet) {
            characterStringMap.put(letter, new ArrayList<>());
        }
        //characterStringMap.put('a', new ArrayList<>());
        String[] words = analyzedText.split(" ");

        for (String oneWord: words) {
            Character firstLetterLowerCase = oneWord.toLowerCase().charAt(0);
            characterStringMap.get(firstLetterLowerCase).add(oneWord);
        }
        return characterStringMap;
    }

   /* public static List<String> splitText(String analyzedText){
        List<String> textAfterSplitting = new ArrayList<>();
        String[] words = analyzedText.split(" ");

        for (String word: words) {
            textAfterSplitting.add(word);
        }
        return textAfterSplitting;
    }*/
}

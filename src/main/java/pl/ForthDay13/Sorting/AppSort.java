package pl.ForthDay13.Sorting;

import java.util.Arrays;

public class AppSort {

    public static void main(String[] args) {
        System.out.println("\n MyBubbleSort way to sort array: ");
        int[] myFirstTab = new int[]{3, 25, 645, 453, 5254, 4, 86, 145, 65, 84, 65, 854, 32, 1, 965, -95};
        BubbleSort.sort(myFirstTab);
        System.out.println(Arrays.toString(myFirstTab));

//        for (int number : myFirstTab) {
//            System.out.print(number + "  ");

        System.out.println("\n Arrays.sort way to sort array: ");

        int[] mySecondTab = new int[]{3, 25, 645, 453, 5254, 4, 86, 145, 65, 84, 65, 854, 32, 1, 965, -95};
        Arrays.sort(mySecondTab);
        System.out.println(Arrays.toString(mySecondTab));

        //        for (int number : mySecondTab) {
//            System.out.print(number + "  ");
        if (Arrays.compare(myFirstTab, mySecondTab) == 0) {
            System.out.println("Congratulations! Your arrays are sorted.");
        } else {
            System.out.println("Oh no! Your arrays are NOT sorted.");
        }

        int[] myThirdTab = Arrays.copyOf(myFirstTab, myFirstTab.length);

    }
}


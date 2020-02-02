package pl.FifthDay14.QuickSort;

import pl.FifthDay14.QuickSort.QuickSort;

import java.util.Arrays;

public class AppQuickSort {
    public static void main(String[] args) {


        int[] myTabOne = new int[]{3, 25, 645, 453, 5254, 4, 86, 145, 65, 84, 65, 854, 32, 1, 965, -95, 0};
        int[] myTabTwo = new int[]{3, 25525, 645, -453, 524, 15, 65, 844, 5, 84, 32, 1, 95, -95};
        System.out.println("Before quick sorting: ");
        System.out.println(Arrays.toString(myTabOne));
        QuickSort.sort(myTabOne);
        System.out.println("After quick sorting: ");
        System.out.println(Arrays.toString(myTabOne));
        System.out.println();
        System.out.println("Before quick sorting: ");
        System.out.println(Arrays.toString(myTabTwo));
        QuickSort.sort(myTabTwo);
        System.out.println("After quick sorting: ");
        System.out.println(Arrays.toString(myTabTwo));
    }
}

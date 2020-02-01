package pl.ForthDay13.Sorting;


public class BubbleSort {
    public static void sort(int[] myTab) {
        boolean swapped = false;
        int extraElement;
        do {
            swapped = false;
            for (int i = 1; i < myTab.length; i++) {
                if (myTab[i - 1] > myTab[i]) {
                    extraElement = myTab[i - 1];
                    myTab[i - 1] = myTab[i];
                    myTab[i] = extraElement;
                    swapped = true;
                }
            }
        } while (swapped);
    }

}

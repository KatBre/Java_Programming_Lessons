package pl.FifthDay14.QuickSort;

public class QuickSort {


    public static void sort(int[] tab) {
        quickSort(tab, 0, tab.length - 1);
    }


    private static void quickSort(int[] tab, int lowerIndex, int higherIndex) {
        int pivot = tab[(lowerIndex + higherIndex) / 2];
        int leftSearch = lowerIndex;
        int rightSearch = higherIndex;
        while (leftSearch <= rightSearch) {
            while (tab[leftSearch] < pivot) {
                leftSearch++;
            }
            while (tab[rightSearch] > pivot) {
                rightSearch--;
            }
            if (leftSearch <= rightSearch) {
                int temp = tab[leftSearch];
                tab[leftSearch] = tab[rightSearch];
                tab[rightSearch] = temp;
                leftSearch++;
                rightSearch--;
            }
        }
        if (lowerIndex < rightSearch) {
            quickSort(tab, lowerIndex, rightSearch);
        }
        if (leftSearch < higherIndex) {
            quickSort(tab, leftSearch, higherIndex);
        }
    }
}

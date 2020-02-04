package pl.FifthDay14.BinarySearch;

public class BinarySearch {
    public static int mySearch(int searchedElement, int[] arr, int lowerIndex, int higherIndex) {
        int middleIndex = (lowerIndex + higherIndex) / 2;
        int middleElement = arr[middleIndex];
        if (searchedElement == arr[middleIndex]) {
            return middleIndex;
        } else if (searchedElement < middleElement) {
            return mySearch(searchedElement, arr, lowerIndex, middleIndex - 1);
        } else if (searchedElement > middleElement) {
            return mySearch(searchedElement, arr, middleIndex + 1, higherIndex);
        } else /*if (higherIndex < lowerIndex)*/ {
            return -1;
        }
    }
}

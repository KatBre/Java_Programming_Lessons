package pl.FifthDay14.SoftDrink;

public class LinearSearchUtil {
    public static int findFirstSoftDrink(SoftDrink searchedDrink, SoftDrink[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchedDrink)) {
                return i;
            }
        }
        return -1;
    }
}

package pl.FifthDay14.BinarySearch;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] myArr = {54, 84, 125, 68, 1445, 2, 965, 36, 257, 68547};


        Arrays.sort(myArr);
//        System.out.println(Arrays.binarySearch(myArr, 68));
        System.out.println(BinarySearch.mySearch(5, myArr, 0, myArr.length));


    }
}

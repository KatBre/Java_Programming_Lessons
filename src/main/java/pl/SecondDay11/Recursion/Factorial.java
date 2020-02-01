package pl.SecondDay11.Recursion;

public class Factorial {
    public static long factorial(int c) {
        if (c == 1) {
            return 1;
        }
        return c * factorial(c - 1);
    }

}

// public static long ex1(int a, int b) {
//        long wynik = 1;
//        for (int i = 0; i < b; i++) {
//            wynik = a * wynik;
//        }
//        return wynik;
//    }
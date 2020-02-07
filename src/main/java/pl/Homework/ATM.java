package pl.Homework;

public class ATM {
    public static int solve(int n) {
        if (n % 10 != 0) {
            return -1;
        }
        else {
            int notes = 0;
            notes += n / 500;
            notes += n % 500 / 200;
            notes += n % 500 % 200 / 100;
            notes += n % 500 % 200 % 100 / 50;
            notes += n % 500 % 200 % 100 % 50 / 20;
            notes += n % 500 % 200 % 100 % 50 % 20 / 10;
            return notes;
        }
    }
}

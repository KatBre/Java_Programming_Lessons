package pl.Homework;

public class HumanToCatAndDogYears {
    public static int[] humanYearsCatYearsDogYears(int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        if (humanYears >= 1) {
            catYears = 15;
            dogYears = 15;
        }
        if (humanYears >= 2) {
            catYears = 24;
            dogYears = 24;
        }
        if (humanYears > 2) {
            catYears = 24 + (4 * (humanYears - 2));
            dogYears = 24 + (5 * (humanYears - 2));
        }
        return new int[]{humanYears, catYears, dogYears};
    }
}

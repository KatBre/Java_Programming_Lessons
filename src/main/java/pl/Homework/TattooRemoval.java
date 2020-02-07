package pl.Homework;

public class TattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        for (String[] row : skinScan) {
            for (int i = 0; i < row.length; i ++) {
                if (row[i].equals("X")) {
                    row[i] = "*";
                }
            }
        }
        return skinScan;
    };
}

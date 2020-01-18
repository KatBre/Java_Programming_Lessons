package pl.Recursion;

public class GreatestCommonDivisor {
    public static int greatestCommonDivisor(int a, int b) {

        int divisor = 0;
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    divisor = i;
                }
            }
        } else if (a < b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    divisor = i;
                }
            }
        }
return divisor;
    }
/*public static int greatestCommonDivisorByRecursion(int x, int y){
int result = 0;
if (x % y == 0) {
    result = y;
} else if (x % y != 0) {
    x = y;
    y = x % y;
}*/

    public static int gcdRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursion(b, a % b);
    }
}


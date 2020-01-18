package pl.Recursion;

public class AppGCD {
    public static void main(String[] args) {
        int a = 3135;
        int b = 1257;
        int greatestCommonDivisor = GreatestCommonDivisor.greatestCommonDivisor(a, b);
        System.out.println("Greatest common divisor for: " + a + " and " + b +  " is: " + greatestCommonDivisor);
        int gcdRecursion = GreatestCommonDivisor.gcdRecursion(a, b);
        System.out.println("Greatest common divisor for: " + a + " and " + b +  " is: " + gcdRecursion);


    }
}

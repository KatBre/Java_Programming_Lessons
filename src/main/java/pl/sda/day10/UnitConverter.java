package pl.sda.day10;

public class UnitConverter {
    public final double TEMP_CONVERT = 1.8;
    public final int DEGREE_CONVERTER = 32;
    public final double MILES_CONVERTER = 0.621371192;
    public final double POUNDS_CONVERTER = 2.20462262;


    public double celsiusToFahrenheit (double celsiusDegree){
        double fahrenheit = ((celsiusDegree * TEMP_CONVERT) + DEGREE_CONVERTER);
        return fahrenheit;
    }

    public double fahrenheitToCelsius (double fahrenheitDegree) {
        double celsius = ((fahrenheitDegree / TEMP_CONVERT) - DEGREE_CONVERTER);
        return celsius;
    }

    public double kilometersToMiles (double kilometers){
        double miles = (kilometers * MILES_CONVERTER);
        return miles;
    }

    public double milesToKilometers (double miles){
        double kilometers = (miles / MILES_CONVERTER);
        return kilometers;
    }

    public double kilogramsToPounds (double kilograms){
        double pounds = (kilograms * POUNDS_CONVERTER);
        return pounds;
    }

    public double poundsToKilograms (double pounds){
        double kilograms = (pounds * POUNDS_CONVERTER);
        return kilograms;
    }
}

package com.example.converter;

public class Converter {

    // Temperature conversion: Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Temperature conversion: Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Length conversion: Kilometers to Miles
    public double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // Length conversion: Miles to Kilometers
    public double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    // Weight conversion: Kilograms to Pounds
    public double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Weight conversion: Pounds to Kilograms
    public double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}

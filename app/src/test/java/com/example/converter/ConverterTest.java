package com.example.converter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {
    private Converter converter = new Converter();

    @Test
    public void testCelsiusToFahrenheit() {
        // Arrange
        double celsius = 0.0;
        double expected = 32.0; // 0°C = 32°F

        // Act
        double result = converter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        double fahrenheit = 32.0;
        double expected = 0.0; // 32°F = 0°C

        // Act
        double result = converter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expected, result, 0.001);
    }
}

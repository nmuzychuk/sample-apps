package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.TemperatureConverter.toFahrenheit;
import static com.nmuzychuk.TemperatureConverter.toCelsius;

public class TemperatureConverterTest {

    @Test
    public void testAbsoluteZero() {
        assertEquals(-459.67, toFahrenheit(-273.15), 0.01);
        assertEquals(-273.15, toCelsius(-459.67), 0.01);
    }

    @Test
    public void testBoilingPointOfWater() {
        assertEquals(212, toFahrenheit(100), 0.01);
        assertEquals(100, toCelsius(212), 0.01);
    }

}

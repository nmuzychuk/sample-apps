package com.nmuzychuk;

public final class TemperatureConverter {

    public static final int FAHRENHEIT_FPW = 32;

    private TemperatureConverter() {
    }

    public static double toFahrenheit(final double celsius) {
        final double ratio = 9.0 / 5;

        return celsius * ratio + FAHRENHEIT_FPW;
    }

    public static double toCelsius(final double fahrenheit) {
        final double ratio = 5.0 / 9;

        return (fahrenheit - FAHRENHEIT_FPW) * ratio;
    }

}

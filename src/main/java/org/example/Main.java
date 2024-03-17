package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static double FartoCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static float KelvinToCelsius(float kelvin) {
        return (kelvin - 273.15f);
    }
    public static void main(String[] args) {
        System.out.println(FartoCelsius(100));
        System.out.println(KelvinToCelsius(100));
        }
    }
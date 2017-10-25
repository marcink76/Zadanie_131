package pl.unitconverter.calculator;

public class MassCalculator {
    public static String massCalculating(String mass, double factor) {
        double massDouble = Double.parseDouble(mass);
        return Double.toString(massDouble * factor);
    }
}

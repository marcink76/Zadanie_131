package pl.unitconverter.calculator;

public class LenghtCalculator {
    public static String lenghtCalculating(String lenght, double factor) {
        double lenghtDouble = Double.parseDouble(lenght);
        return Double.toString(lenghtDouble * factor);
    }
}

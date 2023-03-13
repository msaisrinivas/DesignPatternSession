package designpatterns.factory;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Calculator basicCalculator = new CalculatorFactory().getInstance("basic");
        basicCalculator.calculate("10+11");
        Calculator scientificCalculator = new CalculatorFactory().getInstance("science");
        scientificCalculator.calculate("10+11");
        Calculator programmingCalculator = new CalculatorFactory().getInstance("program");
        programmingCalculator.calculate("10+11");
        Calculator errorCalculator = new CalculatorFactory().getInstance("proghjbdjsbram");
        programmingCalculator.calculate("10+11");
    }
}

package designpatterns.factory;

public class ProgrammingCalculator implements Calculator {
    @Override
    public void calculate(String express) {
        System.out.println("Calculating " + express + " in Programming Calculator");
    }
}

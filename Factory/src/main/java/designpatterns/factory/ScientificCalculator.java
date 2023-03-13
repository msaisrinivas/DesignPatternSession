package designpatterns.factory;

public class ScientificCalculator implements Calculator {
    @Override
    public void calculate(String express) {
        System.out.println("Calculating " + express + " in Scientific Calculator");
    }
}

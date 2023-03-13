package designpatterns.factory;

public class BasicCalculator implements Calculator {
    @Override
    public void calculate(String express) {
        System.out.println("Calculating " + express + " in Basic Calculator");
    }
}

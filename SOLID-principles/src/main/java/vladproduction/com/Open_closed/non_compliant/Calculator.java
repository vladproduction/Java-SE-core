package vladproduction.com.Open_closed.non_compliant;

import java.security.InvalidParameterException;

public class Calculator {

    public static void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operation instanceof Addition addition) {
            addition.setResult(addition.getLeft() + addition.getRight());
            double result = addition.getResult();
            System.out.println(result);
        } else if (operation instanceof Subtraction subtraction) {
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
            double result = subtraction.getResult();
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        CalculatorOperation addition = new Addition(5.0, 3.0);
        calculate(addition);
        System.out.println("----------");
        CalculatorOperation subtraction = new Subtraction(5.0, 3.0);
        calculate(subtraction);
    }
}
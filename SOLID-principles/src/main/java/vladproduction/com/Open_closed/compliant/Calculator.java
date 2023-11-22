package vladproduction.com.Open_closed.compliant;

import java.security.InvalidParameterException;

public class Calculator {

    public static void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        double result = operation.perform();
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculate(new Addition(5.0, 3.0));
        calculate(new Subtraction(5.0, 3.0));
        calculate(new Division(5.0, 2.0));
    }
}

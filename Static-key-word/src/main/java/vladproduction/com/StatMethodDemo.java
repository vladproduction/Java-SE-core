package vladproduction.com;

public class StatMethodDemo {
    public static void main(String[] args) {
        StatMethodDemo statMethodDemo = new StatMethodDemo();
        statMethodDemo.run();

    }

    private void run() {
        String text = "values Taylor's row for sinus:";
        double value = Math.PI / 4;
        double result = 0.0;
        for (int k = 0; k < 8; k++) {
            text += "\nterms " + (k + 1) + ": ";
            // Calculate the term using the Taylor series formula
            double term = ((Math.pow(-1, k) * Math.pow(value, (2 * k) + 1)) / factorial((2 * k) + 1));
            result += term; // Add the term to the overall result
            text += "sin(" + value + ") = " + result;
        }
        System.out.println(text);
    }

    // Helper method to calculate factorial
    private double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}


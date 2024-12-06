package vladproduction.com.ch06_features_descriptions;

public enum Operation {

    PLUS {
        double eval(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double eval(double x, double y) {
            return x - y;
        }
    },
    DIVIDE {
        double eval(double x, double y) {
            return x / y;
        }
    },
    MULTIPLE {
        double eval(double x, double y) {
            return x * y;
        }
    };

    abstract double eval(double x, double y);

    public static void main(String[] args) {
        double x = 20.0;
        double y = 40.0;
        for(Operation op : Operation.values()){
            System.out.println(x + " " + op + " " + y + " = " + op.eval(x, y));
        }
        /*  20.0 PLUS 40.0 = 60.0
            20.0 MINUS 40.0 = -20.0
            20.0 DIVIDE 40.0 = 0.5
            20.0 MULTIPLE 40.0 = 800.0  */
    }

}

package vladproduction.com.if_;

public class IfStatementApp {
    public static void main(String[] args) {

        double rectangle_perimeter = perimeter(2, 2, "Rectangle");
        System.out.println("rectangle_perimeter = " + rectangle_perimeter);
//        double rectangle_perimeter2 = perimeter(2, 2, null);
//        System.out.println("rectangle_perimeter2 = " + rectangle_perimeter2);
        double rectangle_perimeter3 = perimeter(-2, 2, "Rectangle - incorrect");
        System.out.println("rectangle_perimeter3 = " + rectangle_perimeter3);

    }

    //demo method to show if statement:
    public static double perimeter(double sideA, double sideB, String shapeName){
        double result;
        if(shapeName != null){
            if(sideA > 0 && sideB > 0){
                result = 2 * (sideA + sideB);
            } else {
                result = -1;
            }
        } else {
            throw new IllegalArgumentException("shape name should not be null, but: " + shapeName);
        }
        return result;

    }

}



package vladproduction.com.app02;

import vladproduction.com.app01.Rectangle;

public class Main02 {
    public static void main(String[] args) {

        Rectangle02 rectangle = new Rectangle02(2,5);
        int calcArea = rectangle.calcArea();
        System.out.println("calcArea = " + calcArea); //10

        Rectangle02 rectangle2 = new Rectangle02(2,5);
        rectangle2.setWidth(-2);
        int calcArea2 = rectangle2.calcArea();
        System.out.println("calcArea2 = " + calcArea2); //5

    }
}

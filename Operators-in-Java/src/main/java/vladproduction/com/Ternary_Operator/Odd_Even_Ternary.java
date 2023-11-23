package vladproduction.com.app01;

public class Odd_Even_Ternary {
    public static void main(String[] args) {

        int number = 10;
        String text = number%2==0? "even":"odd"; //ternary operator
        System.out.println(text); //even - devide 2 and no remainder of the division
                                  //odd - has reminder

    }
}

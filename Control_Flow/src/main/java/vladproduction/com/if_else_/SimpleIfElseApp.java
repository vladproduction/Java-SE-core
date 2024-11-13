package vladproduction.com.if_else_;

public class SimpleIfElseApp {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        int result;
        if(x > y){
            result = 1;
            System.out.println(result);
        } else if (x == y) {
            result = 0;
            System.out.println(result);
        } else {
            result = 2;
            System.out.println(result);
        }
    }
}

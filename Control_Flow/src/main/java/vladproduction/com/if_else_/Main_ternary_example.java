package vladproduction.com.if_else_;

public class Main_ternary_example {
    public static void main(String[] args) {

        int x = ternary(2);
        System.out.println("x = "+x); //200

        int x2 = alternative(2);
        System.out.println("x2 = "+x2); //200
    }

    static int ternary(int i){
        return i<10? i*100: i*10;
    }

    static int alternative(int i){
        if(i<10)
            return i*100;
        else
            return i*10;
    }
}

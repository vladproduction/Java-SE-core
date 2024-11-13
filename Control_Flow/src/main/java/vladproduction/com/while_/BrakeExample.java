package vladproduction.com.while_;

public class BrakeExample {
    public static void main(String[] args) {
        int x = 1;
        while (true){
            if(x > 5){
                break;
            }
            System.out.println("Iteration: " + x++);
        }
    }
    /*Iteration: 1
    Iteration: 2
    Iteration: 3
    Iteration: 4
    Iteration: 5*/
}

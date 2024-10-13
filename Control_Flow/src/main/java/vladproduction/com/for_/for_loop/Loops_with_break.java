package vladproduction.com.for_.for_loop;

public class Loops_with_break {
    public static void main(String[] args) {

        int passmark = 12;
        boolean passed = false;
//        int[] scores = {10,50,-2,6,84,1,0,5,48,12,11,10,9};
        int[] scores = {100,2,3,4,5,6,7,8,9,10,11,12};
        int steps = 0;
        for (int score : scores) {
            steps++;
            if(score >= passmark){ //if at least one value is greater or equals to passmark, loop break
                passed = true;
                break;
            }
        }
        System.out.println("steps counted: " + steps); //as we see loop does not go any longer after break
        System.out.println("At least one is passed? - " + passed);
    }
}

package vladproduction.com.branching_statement_break;

public class MainBreakStatement {

    public static void main(String[] args) {
        int number = 1;
        loopNumber(number);
    }
    
    public static void loopNumber(int newNumber){
        while(newNumber >= 0){
            if(newNumber < 10){
                newNumber++;
                continue;
            }
            System.out.println(newNumber);
            System.out.println("Done");
            break;
        }
    }
}

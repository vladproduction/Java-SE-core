package vladproduction.com.while_;

public class Main_WDW {

    public static void main(String[] args) {
        //while example
        int sequenceWhile = 9;
        while(sequenceWhile < 10){
            System.out.println("while: " + sequenceWhile);
            sequenceWhile++;
        }
        //do-while example
        int x = 5;
        do{
            System.out.println("do-while: " + x);
            x++;
        }while(x < 10);
        /*do-while: 5
        do-while: 6
        do-while: 7
        do-while: 8
        do-while: 9*/
    }
}

package vladproduction.com.while_;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        DoWhileDemo whileDemo = new DoWhileDemo();
        whileDemo.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int highBorder = scanner.nextInt();
        int indexVariable = scanner.nextInt();
        int s = 0;
        do{
            s+=indexVariable;
            indexVariable++;
        }
        while (indexVariable <= highBorder);
            System.out.println(s);

        System.out.println("Sum numbers from 1 to " + highBorder + ": " + s);
    }
}

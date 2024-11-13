package vladproduction.com.switch_;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String name = switch (number) {
            case 1 -> "First operation";
            case 2 -> "Second operation";
            case 3 -> "Third operation";
            case 4 -> "Forth operation";
            case 5 -> "Fifth operation";
            default -> "No value";
        };
        System.out.println(name);
    }
    //output:
    /*1
    First operation*/
}

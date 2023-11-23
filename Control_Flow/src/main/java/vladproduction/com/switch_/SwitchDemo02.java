package vladproduction.com.switch_;

import java.util.Scanner;

public class SwitchDemo02 {

    public static void main(String[] args) {
        SwitchDemo02 main = new SwitchDemo02();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set number from 1 to 9:");
        int number = scanner.nextInt();
        String text = switch (number) { // Оператор выбора
            case 1, 9 -> "Вы ввели нечетное,\n но не простое число.";
            case 2, 3, 5, 7 -> "Вы ввели простое число.";
            case 4, 8 -> "Вы ввели число - степень двойки.";
            case 6 -> "Вы ввели 6 - совершенное число.";
            default -> "";
        };

        System.out.println(text);
    }
}


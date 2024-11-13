package vladproduction.com.switch_;

public class YieldSwitch {
    public static void main(String[] args) {
        var number = 77;
        int result = evenOddMaker(number);
        System.out.println("result = " + result);
    }
    private static int evenOddMaker(int number){
        return switch (number){
            case 1, 3, 5, 7, 9 -> number += 1;
            case 2, 4, 6, 8, 10 -> number += 1;
            default -> {
                System.out.println("range is up");
                yield number += 1000;
            }
        };
    }
}

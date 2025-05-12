package com.vladproduction.app28.armstrong_number;

public class ArmstrongNumber {
    public static void main(String[] args) {

        hardcodeExample();


        System.out.println("\nGeneral approach");
        int num = 9474; // Try with 153, 9474, 9475, 370, etc.
        isArmstrong(num);
    }

    private static void isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }
        if(sum == original){
            System.out.println(original + " is an Armstrong number" + " (sum = " + sum + ")");
        }else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }

    private static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }


    private static void hardcodeExample() {
        int num = 153;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, 3);
            temp /= 10;
        }

        System.out.println("Hardcode Example: " + num + " = " + sum);
        System.out.println(num == sum); // true if Armstrong
    }
}

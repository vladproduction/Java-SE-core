package com.vladproduction.task_1;

/**
 * 4. Enter integers as command line arguments, calculate their sum (product, div, subtract) and output the result to the console.
 * */
public class TaskApp04 {
    public static void main(String[] args) {

        if(args.length < 3){
            System.out.println("Please provide  two numbers and one operator for calculation");
            System.out.println("Calculation of two numbers provided by such operators: \nsum \nsub \ndiv \nmulti");
            return;
        }
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        String operator = args[2];
        double result;

        switch (operator.toLowerCase()){
            case "sum":
                result = x + y;
                System.out.println("Sum operation chosen: result = " + result);
                break;
            case "sub":
                result = x - y;
                System.out.println("Subtraction operation chosen: result = " + result);
                break;
            case "div":
                if (y != 0) {
                    result = x / y;
                    System.out.println("Division operation chosen: result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case "multi":
                result = x * y;
                System.out.println("Multiplication operation chosen: result = " + result);
                break;
            default:
                System.out.println("Invalid operation! Please specify sum, multi, div, or sub.");
        }

    }

    //command line
    //java .\TaskApp04.java 40 5 div
    //output:
    //Division operation chosen: result = 8.0

}

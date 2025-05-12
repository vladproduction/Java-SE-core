package com.vladproduction.app14.factorial;

public class Main {
    public static void main(String[] args) {

        System.out.println("generate1:");
        generate1(5);
        System.out.println();

        System.out.println("generate2:");
        generate2(5);


    }

    private static void generate1(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
            System.out.print(p + " ");
        }
        System.out.println();
    }

    private static int generate2(int n){
//        System.out.println("n = " + n);
//        if(n == 1){
//            return n;
//        }
//        int tmp = generate2(n - 1);
//        int res = tmp * n;
//        System.out.print(res + " ");
//        return tmp * n;

        System.out.println("Entering generate2(" + n + ")");

        if(n == 1){
            System.out.println("Base case reached: return 1");
            return 1;
        }

        int tmp = generate2(n - 1);
        int res = tmp * n;

        System.out.printf("After recursive call: tmp = generate2(%d) = %d, res = tmp * %d = %d%n", n - 1, tmp, n, res);
        System.out.println("Returning " + res + " from generate2(" + n + ")");
        System.out.print(res + " "); // if keeping this for visual output
        return res;
    }

}

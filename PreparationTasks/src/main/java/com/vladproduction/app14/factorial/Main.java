package com.vladproduction.app14.factorial;

public class Main {
    public static void main(String[] args) {

        generate(5);
        System.out.println("================");
        generate2(5);


    }

    private static int generate(int n){
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
            System.out.println(p);
        }
        return p;
    }

    private static int generate2(int n){
        System.out.println("n = " + n);
        if(n == 1){
            return n;
        }
        int tmp = generate2(n - 1);
        int res = tmp * n;
        System.out.println(res);


        return tmp * n;
    }

}

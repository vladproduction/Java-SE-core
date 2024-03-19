package com.vladproduction.vp49_recursion;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class Main49 {
    public static void main(String[] args) {

        /**recursion - invoke method in  the body of this method*/

        counter(3);
        System.out.println("-----------------");
        System.out.println(factorial(4));
    }

    private static int  factorial(int n) {
        // !4 = 4*3*2*1
        // !1 = 1
        // !12 = 12*11*10 ... *1
        // !0 = 1

        // factorial(4) ->
        //      4 * factorial(3) -> 4 * 6 = 24
        //          3 * factorial(2) -> 3 * 2 = 6
        //              2 * factorial(1) -> 2 * 1 = 2
        //                  factorial(1) = return 1;
        if(n == 1) {
            return 1;
        }
        int res = n * factorial(n - 1);
        System.out.println("res = " + res);
        return res;
    }


    private static void counter(int n) {

        // what is going on in stack:
        /**counter(3) -> counter(2) -> counter(1) -> finish*/

        if(n == 0){  // 'base case' : here we decide to finish by this condition
            return;
        }
        System.out.println(n);
        counter(n - 1); //3, 2, 1
    }
}

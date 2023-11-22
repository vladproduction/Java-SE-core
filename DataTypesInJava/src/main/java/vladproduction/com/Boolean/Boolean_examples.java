package Boolean;

public class Boolean_examples {
    public static void main(String[] args) {
        //#1
        // Suppose that a and b are boolean variables. Show that the expression
        //(!(a && b) && (a || b)) || ((a && b) || !(a || b))
        //evaluates to true.

        boolean a = true;
        boolean b = true;

        boolean cond1 = !(a && b) ;
        System.out.println(cond1);
        boolean cond2 = (a || b);
        System.out.println(cond2);
        boolean cond3 = (!(a && b) && (a || b));
        System.out.println(cond3);
        boolean cond4 = ((a && b) || !(a || b));
        System.out.println(cond4);
        boolean cond5 = cond3 || cond4;
        System.out.println(cond5);

        //#2
        //Suppose that a1 and b1 are int variables. Simplify the following expression:
        //(!(a1 < b1) && !(a1 > b1)).

        int a1 = 100;
        int b1 = 335;
        boolean exp = (!(a1 < b1) && !(a1 > b1));
        System.out.println("exp="+exp);

        //#3
//        Write a program that takes three positive integers as command-line
//        arguments and prints false if any one of them is greater than or equal to the sum
//        of the other two and true otherwise. (Note: This computation tests whether the
//        three numbers could be the lengths of the sides of some triangle.)


    }

}



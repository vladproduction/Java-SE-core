package vladproduction.com.stringMethods;

import java.util.Arrays;

public class CapitalizeAllFirst {
    public static void main(String[] args) {

        String line1 = "this is a SIMPLE sentence.";
        //System.out.println(line1);

        String [] words = line1.split(" ");
        //System.out.println(Arrays.toString(words));
        String line2 = "", line3 = "", line4 = "", line5 = "", line6 = "", element;

        for (String word: words) {
            element = word.substring(0,1).toUpperCase() + word.substring(1);
            //beginIndex – the beginning index, inclusive
            //System.out.println(first);
            line2 = line2 + element + " ";
            line3 = line3 + element + "+";
            line4 = line4 + element + "-";
            line5 = line5 + element + "*";
            line6 = line6 + element + "/";
        }
        System.out.println("line1: " + line1); //line1: this is a SIMPLE sentence.
        System.out.println("========");
        System.out.println("line2: " + line2); //line2: This Is A SIMPLE Sentence.
        System.out.println("line3: " + line3); //line3: This+Is+A+SIMPLE+Sentence.+
        System.out.println("line4: " + line4); //line4: This-Is-A-SIMPLE-Sentence.-
        System.out.println("line5: " + line5); //line5: This*Is*A*SIMPLE*Sentence.*
        System.out.println("line6: " + line6); //line6: This/Is/A/SIMPLE/Sentence./

        System.out.println("=======");
        String upper = line1.toUpperCase();
        System.out.println("upper = " + upper);
        String lower = line1.toLowerCase();
        System.out.println("lower = " + lower);
    }
}

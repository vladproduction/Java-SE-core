package vladproduction.com.for_;

public class MainForDemo02 {
    public static void main(String[] args) {
        for (int i=5;i<=7;i++){  // --> if we get[i] from 5 to 7
            System.out.println("number; i="+i);
        }
        System.out.println();

        for (int i=0;i<=10;i=i+2){  //--> if we get[i] from 0 to 10 by step every second
            System.out.println("number2(every second); i="+i);
        }
        System.out.println();

        System.out.println("create Array, println: (as format); (loop i++)");
        String[] sports = new String[3];
        sports[0]="football";
        sports[1]="hokey";
        sports[2]="basketball";
        System.out.println(String.format("array sports; 0=%s,1=%s,2=%s",sports[0],sports[1],sports[2]));

        int n = sports.length;
        for(int i=0;i<n;i++){
            System.out.println(i+"="+sports[i]);
        }
        System.out.println();

        System.out.println("other type of Array creation, and print it:-->");
        int [] num2 = {1,2,3,58,4,6,9,8,7,45,16,23,46,78,22,-5};
        //int na = num2.length;
        for (int i=0;i<num2.length;i++){
            System.out.println(i+"="+num2[i]);
        }
    }
}

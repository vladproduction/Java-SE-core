package vladproduction.com.ch01.People;


//interfaces can extends
//also show constant params which are using in method


import vladproduction.com.ch01.Animal_Interfaces.Floating;

public interface Floating_hum extends Floating {

    String SWIM = "s";
    String DIVE = "d";

    default void swim(String x) {
        if(x==SWIM){
            System.out.println("People can swim in water");
        } else if (x==DIVE) {
            System.out.println("Diving - is a special underwater swim");
        }else {
            System.out.println("People using boat");
        }

    }

}

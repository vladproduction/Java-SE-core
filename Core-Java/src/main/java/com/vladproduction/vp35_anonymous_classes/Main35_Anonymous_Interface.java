package com.vladproduction.vp35_anonymous_classes;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main35_Anonymous_Interface {
    public static void main(String[] args) {

        System.out.println();
        //---PART # 1--------------------------------------
        System.out.println("----some examples of lambda as interface method return---------");
        Jumping jumpA = new Jumping() {
            @Override
            public String jump() {
                return "AAA";
            }
        };

        Jumping jumpB = () -> "BBB";

        Jumping jumpC = () -> { return "CCC";};

        Jumping jumpD = () -> {
            StringBuilder sb = new StringBuilder();
            sb.append("Taking a running start...").append("\n").append("Jumps high!").append("\n").append("Attempt success!");
            return sb.toString();
        };

        System.out.println("jumpA = " + jumpA.jump());
        System.out.println("jumpB = " + jumpB.jump());
        System.out.println("jumpC = " + jumpC.jump());
        System.out.println(jumpD.jump());


        System.out.println();
        //---PART # 2--------------------------------------
        System.out.println("------example of creating instance: Athlete-------");

        Athlete athlete = new Athlete(true);
        athlete.jump();
        athlete.didResultSuccess();
        athlete.printInfo();


        System.out.println();
        //---PART # 3--------------------------------------
        System.out.println("------example of creating interface logic for Athlete-------");
        Jumping athleteJumping1 = new Athlete(false);
        athleteJumping1.jump();
        ((Athlete) athleteJumping1).didResultSuccess();
        ((Athlete) athleteJumping1).checkResult(((Athlete) athleteJumping1).didResultSuccess());
        ((Athlete) athleteJumping1).printInfo();


    }
}

interface Jumping{
    String jump();
    default boolean checkResult(boolean successful) {
        return successful;
    }

}

class Athlete implements Jumping{

    private final boolean success;

    public Athlete(boolean success) {
        this.success = success;
    }

    @Override
    public String jump() {
        return "Athlete jumps!";
    }

    public boolean didResultSuccess(){

        return checkResult(this.success);
    }

    public void printInfo(){
        System.out.println(this.jump() + ": " + checkResult(this.success));
    }
}

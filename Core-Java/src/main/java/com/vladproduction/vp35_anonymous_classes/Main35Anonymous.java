package com.vladproduction.vp35_anonymous_classes;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main35Anonymous {
    public static void main(String[] args) {
        Jumping jumpA = new Jumping() {
            @Override
            public String jump() {
                return "AAA";
            }
        };
        Jumping jumpB = () -> "BBB";

        Jumping jumpC = () -> { return "CCC";};

        System.out.println(jumpA.jump());
        System.out.println(jumpB.jump());
        System.out.println(jumpC.jump());


        //-----------------------------------------



        Jumping jumper1 = () -> {
            StringBuilder sb = new StringBuilder();
            sb.append("Taking a running start...").append("\n").append("Jumps high!");
            return sb.toString();
        };
        System.out.println(jumper1.jump());
        System.out.println("------Athlete.class: athleteJumping-------------------------------------");

        //-------Athlete.class-------------
        Athlete athleteJumping = new Athlete(true);
        athleteJumping.jump();
        athleteJumping.didResultSuccess();
        athleteJumping.printInfo();

        System.out.println("-------Jumping.interface: athleteJumping1------------------------------------");
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

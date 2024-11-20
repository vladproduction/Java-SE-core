package com.vladproduction.designer_chains.contr4;

public class MainPlayersApp {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer("John");

        //if calling super(name)
        /*Player constructor name: John
        BasketballPlayer constructor name: John*/

        //if default superclass constructor exist:
        /*BasketballPlayer constructor name: John*/

        //if both we`re have: super(name) and default super constructor:
        /*Player constructor name: John
        BasketballPlayer constructor name: John*/

    }
}



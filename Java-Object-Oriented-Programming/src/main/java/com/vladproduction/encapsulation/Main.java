package com.vladproduction.encapsulation;

import static com.vladproduction.encapsulation.TreeClass.TRUNK_COLOR;

public class Main {
    public static void main(String[] args) {

        TreeClass mapleTree = new TreeClass(100, 25, TreeType.MAPLE);

        System.out.println("---getters()---");
        //using getters
        System.out.println(mapleTree.getHeight());
        System.out.println(mapleTree.getTrunkDiameter());
        System.out.println(mapleTree.getTreeType());

        System.out.println("---grow()---");
//        mapleTree.height = 180;
        mapleTree.grow();
        //check modified attributes after function:
        System.out.println(mapleTree.getHeight());
        System.out.println(mapleTree.getTrunkDiameter());
        System.out.println(mapleTree.getTreeType());

        System.out.println("---setters()---");
        //to modify attributes we`re using setters
        mapleTree.setHeight(180); //trying again to set 180
        mapleTree.setTrunkDiameter(30);
        System.out.println(mapleTree.getHeight()); //and check if it modified
        System.out.println(mapleTree.getTrunkDiameter());






    }
}

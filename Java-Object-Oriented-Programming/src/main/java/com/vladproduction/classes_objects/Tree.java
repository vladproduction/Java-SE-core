package com.vladproduction.classes_objects;

import java.awt.*;

public class Tree {

    //attributes (non-static) very dependent on instances of the class
    double height;
    double trunkDiameter;
    TreeType treeType;

    //static attributes (belong to the class itself)
    static Color TRUNK_COLOR = new Color(102, 51,0);


    //constructor
    public Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    //non-static members (methods belong to the class instance)
    void grow(){
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree(){
        if(this.height > 100){
            System.out.print("announce(): ");
            System.out.println("TreeClass " + this.treeType + " is tall!");
        }
    }

    //static methods/members rely on to the class (not just to concrete instance)
    //can be accessed without creating an instance of the class
    static void announceTree(){
            System.out.print("Look at this " + Tree.TRUNK_COLOR + " tree!");
    }

}

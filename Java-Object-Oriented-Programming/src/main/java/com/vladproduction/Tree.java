package com.vladproduction;

public class Tree {

    double height;
    double trunkDiameter;
    TreeType treeType;

    public Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    void grow(){
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree(){
        if(this.height > 100){
            System.out.print("announce(): ");
            System.out.println("Tree " + this.treeType + " is tall!");
        }
    }

}

package com.vladproduction.encapsulation;

import java.awt.*;

public class TreeClass {
    protected static Color TRUNK_COLOR = new Color(102, 51,0);
    private double height;
    private double trunkDiameter;
    private final TreeType treeType;

    public TreeClass(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    //for access to the private attributes of the class we have to have public methods (getters & setters)
    public double getHeight(){
        return height;
    }
    public double getTrunkDiameter(){
        return trunkDiameter;
    }
    public TreeType getTreeType() {
        return treeType;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setTrunkDiameter(double trunkDiameter){
        this.trunkDiameter = trunkDiameter;
    }
    //no setter for treeType (ones instance been created it couldn`t be modified)

    public void grow(){
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    public void announceTallTree(){
        if(this.height > 100){
            System.out.print("announce(): ");
            System.out.println("TreeClass " + this.treeType + " is tall!");
        }
    }

}

package com.vladproduction;

import static com.vladproduction.Tree.TRUNK_COLOR;

public class Main {
    public static void main(String[] args) {
        Tree oakTree = new Tree(120, 12, TreeType.OAK);

        oakTree.announceTallTree();

        Tree mapleTree = new Tree(90, 30, TreeType.MAPLE);

        mapleTree.announceTallTree();

        /*if (oakTree.height > 100){
            System.out.println("Tree " + oakTree.treeType + " is tall!");
        }

        if (mapleTree.height > 100){
            System.out.println("Tree " + mapleTree.treeType + " is tall!");
        }*/

        //using static attribute
        System.out.println(TRUNK_COLOR);
        //or static method
        Tree.announceTree();
    }
}

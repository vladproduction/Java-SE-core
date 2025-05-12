package com.vladproduction.app16.this_keyword;

public class Main {
    public static void main(String[] args) {

        ThisKeyword thisKeyword = new ThisKeyword(10, 20);
        thisKeyword.display();

        //or

        ThisKeyword thisKeyword2 = new ThisKeyword();
        thisKeyword2.setData(30, 40);
        thisKeyword2.display();

    }
}

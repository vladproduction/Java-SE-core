package com.vladproduction.casting_instanceof;

public class Main {
    public static void main(String[] arg) {
        Cat myCat = new BritishCat();
        BritishCat cat2 = (BritishCat) myCat;
//        PersianCat cat3 = (PersianCat) myCat;//ClassCastException: BritishCat cannot be cast to class PersianCat

        //resolve such case:
        if (myCat instanceof PersianCat) {
            System.out.println("Persian cat!");
            PersianCat сat3 = (PersianCat) myCat;
        } else {
            System.out.println("Not Persian cat!");
        }
    }
}

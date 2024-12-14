package com.vladproduction.operators.ternary;

public class MainApp01 {
    public static void main(String[] args) {
        int bonus;
        int discount = 10;
        int purchaseItem = 5;
        final int DISCOUNT_LIMIT = 3;
        bonus = getBonusBaseConstruction(purchaseItem, DISCOUNT_LIMIT, discount);
        System.out.println(bonus);

        System.out.println("=====*** ternary operator ***=====");
        bonus = purchaseItem > DISCOUNT_LIMIT ? discount : 0;
        System.out.println(bonus);

    }

    private static int getBonusBaseConstruction(int purchaseItem, int DISCOUNT_LIMIT, int discount) {
        int bonus;
        if(purchaseItem > DISCOUNT_LIMIT){
            System.out.print("bonus is ");
            bonus = discount;
            System.out.println(bonus);
        } else {
            bonus = 0;
        }
        return bonus;
    }
}

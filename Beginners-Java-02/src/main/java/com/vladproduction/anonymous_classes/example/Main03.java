package com.vladproduction.anonymous_classes.example;

public class Main03 {
    public static void main(String[] args) {

        Audi obj = new Audi(){
            private boolean isWork;
            public void isDrive(){
                this.isWork = true;
            }
            public void printInfo(){
                System.out.println(isWork);
            }
        };
        obj.printInfo();
        obj.isDrive(); //set true here
        obj.printInfo();

    }

    private static class Audi {
        public void printInfo(){}
        public void isDrive(){}
    }
}

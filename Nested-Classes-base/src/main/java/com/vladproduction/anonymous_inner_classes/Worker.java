package com.vladproduction.anonymous_inner_classes;

public class Worker {
    public static void main(String[] args) {
        doJob(); //Tester work is done!
    }
    static void doJob(){
        CustomJob customJob = new CustomJob() { //declaration of anonymous class
            @Override
            public void job() {
                System.out.println("Tester work is done!");
            }
        };
        customJob.job();
    }
}

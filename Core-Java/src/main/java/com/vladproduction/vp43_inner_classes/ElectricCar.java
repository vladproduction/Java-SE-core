package com.vladproduction.vp43_inner_classes;

import java.util.Date;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class ElectricCar {
    /**three types of inner classes:
     * 1) inner non-static class (Motor)
     * 2) inner static class (Battery)
     * 3) inner classes inside methods ()*/
    private int id;
    private class Motor{
        public void startMotor(){
            System.out.println("Motor is started now for ElectronicCar: " + id);
        }
    }

    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public ElectricCar(int id) {
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final Date time = new Date();
        class StartingBtn{
            public void usingBtn(){
                System.out.println("Btn 'start' function for car " + id);
                System.out.println("ElectricCar started at: " + time.getTime());
            }
        }

        System.out.println("ElectricCar " + id + " is start");
        StartingBtn startingBtn = new StartingBtn();
        startingBtn.usingBtn();
    }
}

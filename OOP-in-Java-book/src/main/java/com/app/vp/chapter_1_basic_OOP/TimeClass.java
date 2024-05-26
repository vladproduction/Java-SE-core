package com.app.vp.chapter_1_basic_OOP;

/**
 *
 * */

public class TimeClass {

    private int second;
    private int minute;
    private int hour;

    //default constructor
    public TimeClass() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    //constructor with parameters
    public TimeClass(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    //getters and setters
    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if(second < 59){
            this.second = second;
        } else {
            System.out.println("Invalid value for second");
        }
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if(minute < 59){
            this.minute = minute;
        } else {
            System.out.println("Invalid value for minute");
        }
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if(hour < 23){
            this.hour = hour;
        } else {
            System.out.println("Invalid value for hour");
        }
    }

    /**
     * method to adjust time by parameters
     * */
    public void setTimeClass(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    /**
     * grows up on 1 second and return TimeClass object as 'this' for holding (support)
     * cascade operations
     * in case 23:59:59 will return 00:00:00
     * */
    public TimeClass nextSecond(){

        ++second;
        if(second >= 60){
            second = 0;
            minute++;
            if(minute >= 60){
                minute = 0;
                ++hour;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        return this; //return this to support cascade operations (for example: time1.nextSecond().nextSecond())
    }

    /**
     * overridden toString() for printing in custom manner
     * */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second); //specification '0' for printing previous '0' if it possible
    }
}

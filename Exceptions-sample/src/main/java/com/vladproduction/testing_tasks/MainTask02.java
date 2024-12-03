package com.vladproduction.testing_tasks;

public class MainTask02 {
    public static void main(String[] args) {
        MainTask02 main = new MainTask02();
        System.out.println("In Main: " + main.getInt());
        /*About to return: 10
        Return value is now: 20
        In Main: 10*/
    }
    public int getInt() {
        int returnVal = 10;
        try  {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        }  catch (Exception e) {
            System.out.println("About to return: " + returnVal);
            return returnVal;
        }  finally {
            returnVal  += 10;
            System.out.println("Return value is now: " + returnVal);
        }
        return returnVal;
    }
}



package com.vladproduction.mostCommonExceptions;

public class Main {
    public static void main(String[] args) {
        try {
            //1) Error: java.lang.StackOverflowError
            MyRecursionStackOverFlow item = new MyRecursionStackOverFlow();
            item.searchFile();

            // 2.1) RuntimeException: ArrayIndexOutOfBoundsException
            int[] data = new int[3];
            System.out.println("Start!");
            int value = data[10];
            System.out.println("value: "+value);
            System.out.println("Finish!");

            // 2.2) RuntimeException: NullPointerException
            String s = null;
            s.hashCode();
        }
        catch (Error ex){
            System.out.println("------Error ex-----");
            System.out.println("Class: "+ex.getClass());
            System.out.println("Message: "+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("------Exception ex-----");
            System.out.println("Class: "+ex.getClass());
            System.out.println("Message: "+ex.getMessage());
        }
        catch (Throwable th){
            System.out.println("------Throwable th-----");
            System.out.println("Class: "+th.getClass());
            System.out.println("Message: "+th.getMessage());
        }
    }
}

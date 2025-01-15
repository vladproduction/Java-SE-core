package com.vladproduction._04_multithreading.cases_to_use;

/**
 * Using class Thread to override run();
 * */
public class MyThread extends Thread{

    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println("MyThread is started!");
            Thread.sleep(2000);
            System.out.println("MyThread is finished!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread("myThread");
        myThread.start();
        //change name of thread:
        myThread.setThreadName("updated: myThread");
        System.out.println(myThread.getThreadName());
    }
}

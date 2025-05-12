package com.vladproduction.app12.covariant;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        A a = worker.work();
        worker = new SimpleWorker();
        A work = worker.work(); //can`t take B
        System.out.println(work);

    }
}

package com.vladproduction.string_handling;

public class StringBufferMultithreadedExample {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        Thread thread1 = new Thread(new StringModifier(stringBuffer, "Thread #1: "));
        Thread thread2 = new Thread(new StringModifier(stringBuffer, "Thread #2: "));
        Thread thread3 = new Thread(new StringModifier(stringBuffer, "Thread #3: "));

        thread1.start();
        thread2.start();
        thread3.start();

        //waiting for all threads to finish:
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final content of the StringBuffer
        System.out.println("Final content of StringBuffer: ");
        System.out.println(stringBuffer);

    }
}

class StringModifier implements Runnable {

    private final StringBuffer stringBuffer;
    private final String message;

    public StringModifier(StringBuffer stringBuffer, String message) {
        this.stringBuffer = stringBuffer;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (stringBuffer) {
            stringBuffer.append(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stringBuffer.append("\n");
        }
    }
}

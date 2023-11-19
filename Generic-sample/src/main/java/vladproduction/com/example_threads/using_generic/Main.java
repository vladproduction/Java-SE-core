package vladproduction.com.example_threads.using_generic;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the custom thread class with a String value
        MyThread<String> thread1 = new MyThread<>("Hello");

        // Create an instance of the custom thread class with an Integer value
        MyThread<Integer> thread2 = new MyThread<>(123);

        // Start the threads
        thread1.start();
        thread2.start();

        // Code executed by the main thread
        System.out.println("Main thread is running!");
    }
}

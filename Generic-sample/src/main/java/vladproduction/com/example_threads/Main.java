package vladproduction.com.example_threads;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the custom thread class
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();

        // Code executed by the main thread
        System.out.println("Main thread is running!");
    }
}

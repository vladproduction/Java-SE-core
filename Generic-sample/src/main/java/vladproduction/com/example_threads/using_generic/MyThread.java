package vladproduction.com.example_threads.using_generic;

class MyThread<T> extends Thread {
    private final T value;

    public MyThread(T value){
        this.value = value;
    }

    public void run() {
        // code to be executed in the thread
        System.out.println("Thread is running with value: " + value);
    }
}

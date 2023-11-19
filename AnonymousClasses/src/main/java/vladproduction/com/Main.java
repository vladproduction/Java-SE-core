package vladproduction.com;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        });

        thread.start();

    }
}

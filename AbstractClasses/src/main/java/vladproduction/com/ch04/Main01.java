package vladproduction.com.ch04;

public class Main01 {
    public static void main(String[] args) {
        Worker manager = new Manager();
        manager.doWork();
        Worker driver = new Driver();
        driver.doWork();

    }
}

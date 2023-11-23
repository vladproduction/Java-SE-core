package vladproduction.com.ch01.People;

public interface Runnable_hum extends Runnable{
    @Override
    default void run() {
        System.out.println("People running by humans style ");
    }
}

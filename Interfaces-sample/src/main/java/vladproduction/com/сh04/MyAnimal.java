package vladproduction.com.сh04;

public class MyAnimal implements Dog, Cat{
    @Override
    public void jump() {
        System.out.println("can jumping ");
    }

    @Override
    public void run() {
        System.out.println("can running ");
    }
}

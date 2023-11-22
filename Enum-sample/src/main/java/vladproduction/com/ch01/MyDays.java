package vladproduction.com.ch01;

public enum MyDays implements Interface{

    MONDAY, TUESDAY, WEDNESDAY;


    @Override
    public void play() {
        System.out.println("play");
    }
}

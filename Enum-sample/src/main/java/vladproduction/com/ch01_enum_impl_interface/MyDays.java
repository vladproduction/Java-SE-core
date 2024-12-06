package vladproduction.com.ch01_enum_impl_interface;

public enum MyDays implements Interface{

    MONDAY, TUESDAY, WEDNESDAY;


    @Override
    public void play() {
        System.out.println("play");
    }
}

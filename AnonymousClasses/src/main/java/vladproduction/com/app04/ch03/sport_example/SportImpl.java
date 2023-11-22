package Anonim_class.ch03.sport_example;

public class SportImpl implements Sport{
    @Override
    public void rules() {
        System.out.println("default rules");
    }

    @Override
    public void play() {
        System.out.println("default play");
    }
}

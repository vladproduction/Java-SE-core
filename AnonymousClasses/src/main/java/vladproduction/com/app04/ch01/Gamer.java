package Anonim_class.ch01;

public class Gamer {
    public void playGame(Playable x){
        System.out.println("game start");
        x.ball();
        x.rules();
        System.out.println("game finish");
    }
}

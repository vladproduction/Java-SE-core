package Anonim_class.ch01;



public class Referee {
    public void gameReferee(Playable d){
        System.out.println("match referee functions");
        d.ball();
        d.rules();
        System.out.println("game playing 90 minutes + additional time");
    }
}

package Anonim_class.ch01;

public class Main02 {
    public static void main(String[] args){
        Gamer gamer = new Gamer();
        gamer.playGame(new Playable() {
            @Override
            public void ball() {
                System.out.println("play by football ball");
            }

            @Override
            public void rules() {
                System.out.println("football rules");
            }
        });
        Referee referee = new Referee();
        referee.gameReferee(new Playable() {
            @Override
            public void ball() {
                System.out.println("ball N5");
            }

            @Override
            public void rules() {
                System.out.println("person who judge the game");
            }
        });
    }
}

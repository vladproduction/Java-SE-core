package vladproduction.com.app04;

public class MainPlayer {
    public static void main(String[] args) {

        Player p = new Player();
        p.run();

        Player p2 = new BasketPlayer();
        p2.run();

        p2.run(); //compile time (access method by type reference)

        BasketPlayer p3 = new BasketPlayer();
        p3.run();
        p3.jump();



    }
}

package Anonim_class.ch01;

public class Main {
    public static void main(String[] args) {
        Playable x = new Playable() {
            {
                System.out.println("Block-1");
            }

            @Override
            public void rules() {

            }

            @Override
            public void ball() {
                System.out.println("\tplay with ball");
            }
        };
        x.ball();
    }
}

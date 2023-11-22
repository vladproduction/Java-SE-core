package Anonim_class.ch03.sport_example;

public class Main {
    public static void main(String[] args) {
        Sport sport = new SportImpl();
        sport.rules();
        sport.play();

        Sport sport1 = new Sport() {
            @Override
            public void rules() {
                System.out.println("rules sport1");

            }

            @Override
            public void play() {
                System.out.println("play sport1");

            }
        };
        sport1.rules();
        sport1.play();

        int t = 1;
        System.out.println("----------------------------");
        describeSport(sport);
        describeSport(sport1);
        describeSport(new Sport() {
            @Override
            public void rules() {
                System.out.println("sport3 rules; t="+t);

            }

            @Override
            public void play() {
                System.out.println("sport3 play; t="+t);
            }
        });
    }

    private static void describeSport(Sport kind){
        kind.rules();
        kind.play();
    }

}

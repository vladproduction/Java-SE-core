package chapters.control_Instructions.switch_case_selection_statement;

public class SwitchExample {
    public static void main(String[] args) {

        int number = 0;
        switch (number){
            case 1:
                Game.start();
                break;
            case 2:
                Game.finish();
                break;
            default:
                Game.showScore();
        }
    }

    static class Game{
        static String start(){
            String text = "start()";
            return text;
        }
        static String finish(){
            String text = "finish()";
            return text;
        }
        public static void showScore() {
            System.out.println("Game.showScore()");
        }
    }

}

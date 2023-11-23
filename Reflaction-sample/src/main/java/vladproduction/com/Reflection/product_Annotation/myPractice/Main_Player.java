package Reflection.product_Annotation.myPractice;

public class Main_Player {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("Player1");
        player.setNumber(-10);
        System.out.println(player);

        MyValidatorEngine myValidatorEngine = new MyValidatorEngine();
        //myValidatorEngine.validate(player);

        //right value example:
        player.setNumber(10);
        myValidatorEngine.validate(player);
        System.out.println(player); //no error message
    }
}

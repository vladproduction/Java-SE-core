package vladproduction.com.app04;

public class BasketPlayer extends Player{

    //overridden method
    public void run(){
        System.out.println("basket-run");
    }

    public void run(int a){
        System.out.println("basket-run");
    }

    public void jump(){
        System.out.println("basic jump");
    }
    public void jump(int a){
        System.out.println("long jump");
    }
    public void jump(int a, int b){
        System.out.println("height + long jump");
    }
}

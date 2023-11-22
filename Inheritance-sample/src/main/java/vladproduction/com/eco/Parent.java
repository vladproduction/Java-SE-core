package vladproduction.com.eco;

public class Parent {
    public void doAction(){
        System.out.println("Parent-doAction()");
    }
    public void doAction(int repeatCount){
        for(int i =0; i<repeatCount;i++){
            System.out.println("Parent-doAction(repeatCount)");
        }
    }
}

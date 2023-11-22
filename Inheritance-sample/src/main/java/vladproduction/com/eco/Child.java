package vladproduction.com.eco;

public class Child extends Parent{
    public void doAction(String text){
        System.out.println("Child-doAction(text)"+text);
    }

    @Override
    public void doAction() {
        System.out.println("Child-doAction()");

    }
    public void doActionParent() {
        super.doAction();
    }
}

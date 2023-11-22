package vladproduction.com.Clone.app01.covariant;

public class MyChild  extends MyParent {

    //covariant
    //при переопределении(override) можно возвращать любого наследника (MyChild вместо MyParent)
    //public MyParent doAction(){
    @Override
    public MyChild doAction() {
        return new MyChild();
    }
}

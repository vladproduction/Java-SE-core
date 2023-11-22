package vladproduction.com.Mashinery;

public class Tractors extends Mashinery {
    public void powerAgro(){
        System.out.println("Have a big power engine");
    }
    public void driving(){
        System.out.println("driving on the field and doing special job");
        super.driving(); //super can also evoke in addition with this overridden
    }
}

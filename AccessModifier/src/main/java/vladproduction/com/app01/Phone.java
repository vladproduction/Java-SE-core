package vladproduction.com.app01;

public class Phone {

    private String model = "samsung";
    int weight = 10;
    protected String color;

    public int calculatePrice(){
        int price = 0;
        if("samsung".equals(model)){
            price = 1000;
        }
        return price;
    }

    public void printWeight(){
        System.out.println("weight="+weight);
    }

    public void printColor(){
        System.out.println("color="+color);
    }

    public void call(){
        System.out.println("Phone.call()");
    }

    protected void sms(){
        System.out.println("Phone.sms()");
    }

    void makePhoto(){
        System.out.println("Phone.makePhoto()");
    }

    private void alarm(){
        System.out.println("Phone.alarm");
    }



}

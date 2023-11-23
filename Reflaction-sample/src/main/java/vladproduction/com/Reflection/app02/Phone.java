package Reflection.app02;

public class Phone {

    public String model;
    private int price;

    public void info(){
        System.out.println("model: "+model+"; "+"price: "+price);
    }

    public int priceDiscount(int price){
        if(price<=3000){
            price=price+10;
        }else
        if(price>=3000){
            price= (int) ((double)price*0.15);
        }
        return price;
    }
}

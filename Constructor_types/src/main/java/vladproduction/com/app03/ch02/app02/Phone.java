package Constructor_examples.ch02.app02;

public class Phone {
    public String model;
    public int price;
    public String color;

    public Phone(){
        System.out.println("#1 Constructor default");
    }
    public Phone(String phoneModel){
        System.out.println("#2 First Parameter: Phone(String phoneModel)");
        model = phoneModel;
        System.out.println(phoneModel);
    }
    public Phone(int phonePrice){
        System.out.println("#3 Second Parameter: Phone(int phonePrice)");
        price = phonePrice;
        System.out.println(phonePrice);
    }
    public Phone(String phoneModel, String phoneColor, int phonePrice){
        System.out.println("All Params:Phone(String phoneModel, String phoneColor, int phonePrice)");
        model = phoneModel;
        color = phoneColor;
        price = phonePrice;
        System.out.println("phoneModel="+phoneModel);// то что в кавычках, пишем также как и в скобках
        System.out.println("phoneColor="+phoneColor);
        System.out.println("phonePrice="+phonePrice);
    }
    public void inform(){
        System.out.println("model: "+model+"; "+"price: "+price+"; "+"color: "+color+";");
        System.out.println(model);
        System.out.println(price);
        System.out.println(color);
    }

}

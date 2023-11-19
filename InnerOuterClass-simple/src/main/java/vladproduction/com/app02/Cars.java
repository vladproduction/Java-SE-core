package vladproduction.com.app02;

public class Cars {
    public String model;
    public String color;
    public int price = 0;


    public Cars(){
        System.out.println("Construction 1");
    }
    public void printCarInfo() {
        System.out.println("model="+model+"; color="+color+"; price="+price);
    }
    public Cars(String carModel, String carColor, int carPrice){
        this.model=carModel;
        color = carColor;
        price = carPrice;
        System.out.println("carModel="+carModel);
        System.out.println("carColor="+carColor);
        System.out.println("carPrice="+carPrice);
    }
}

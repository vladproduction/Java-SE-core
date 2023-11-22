package Constructor_examples.ch01;

public class Vehicles {
    public String model;
    public int price;

    public void info() {
        System.out.println("price: "+price +"; "+"model: "+model);
    }

    public Vehicles(String vehModel, int vehPrice) {
        model = vehModel;
        price = vehPrice;
        System.out.println(model+"; "+price);
    }

    public Vehicles(String vehModel) {
        model = vehModel;
        System.out.println(vehModel);
    }
}

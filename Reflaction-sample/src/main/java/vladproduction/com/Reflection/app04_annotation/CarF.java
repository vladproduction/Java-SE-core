package Reflection.app04_annotation;

public class CarF {

    private String name;
    @MyValidator(errorMessage = "price must be positive")
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarF{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

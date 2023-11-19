package vladproduction.com.app01;

public abstract class Car {

    private String model;
    private String color;
    private int price;

    class Drive{
        private boolean isDrive;
        Drive(boolean isDrive){
            this.isDrive = isDrive;
        }
        void start(){
            System.out.println("start: " + this.isDrive);
        }
        void stop(){
            System.out.println("stop: " + this.isDrive);
        }
    }

    Drive engine = new Drive(false);

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Car() {
    }

    public void printAll(){
        System.out.println(model + "; " + color + "; " + price);
    }
}

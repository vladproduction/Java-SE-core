package vladproduction.com.Clone.app02;




/*
    -Cloneable Interface is empty, we can use it by oun behaviour in order of overridden methods;
    -it should be implemented as interface;
    -in signature of methods throws exception CloneNotSupportedException, or it`s possible
        to catch directly in method body;

     */
public class Car implements Cloneable{

    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


    //shadow clone()
//    public Car clone() throws CloneNotSupportedException {
//        return (Car)super.clone();
//    }

    //deep clone()
    @Override
    public Car clone() throws CloneNotSupportedException {
        Car newCar = new Car();
        newCar.setName(name);
        newCar.setModel(model);
        return newCar;
    }




}

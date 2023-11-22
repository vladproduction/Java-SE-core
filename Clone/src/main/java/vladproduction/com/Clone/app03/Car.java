package vladproduction.com.Clone.app03;

public class Car {
    private String name;
    private String model;
    private String color;
    private Equipment equipment;
    private int price;


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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", equipment=" + equipment +
                ", price=" + price +
                '}';
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car copy = new Car();
        copy.setName(name);
        copy.setModel(model);
        copy.setColor(color);
        copy.setPrice(price);

        String current_typeEngine = equipment.getTypeEngine();
        double current_engineCapacity = equipment.getEngineCapacity();
        Equipment equipmentValue = new Equipment();
        equipmentValue.setTypeEngine(current_typeEngine);
        equipmentValue.setEngineCapacity(current_engineCapacity);

        copy.setEquipment(equipmentValue);


        return copy;
    }
}

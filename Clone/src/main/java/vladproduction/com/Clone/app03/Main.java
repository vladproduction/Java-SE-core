package vladproduction.com.Clone.app03;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car a = new Car();
        a.setName("bmw");
        a.setModel("x6");
        a.setColor("black");
        a.setPrice(50000);

        Equipment Diesel = new Equipment();
        Diesel.setTypeEngine("Diesel");
        Diesel.setEngineCapacity(3.5);
        a.setEquipment(Diesel);

        Car b = a.clone();
        System.out.println("Total clone:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println();

        System.out.println("===Equipment ECO: ");
        System.out.println("update for car b type of engine --> ECO");
        System.out.println("update for car b engine capacity --> 2.5");
        Equipment ECO = new Equipment();
        ECO.setTypeEngine("ECO");
        ECO.setEngineCapacity(2.5);
        b.setEquipment(ECO);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println();

        System.out.println("===Equipment Fuel: ");
        System.out.println("update for car a type of engine --> Fuel");
        System.out.println("update for car a engine capacity --> 2.0");
        Equipment Fuel = new Equipment();
        Fuel.setTypeEngine("Fuel");
        Fuel.setEngineCapacity(2.0);
        a.setEquipment(Fuel);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println();

        System.out.println("===Equipment bEquipment(special properties): ");
        System.out.println("update for car b type of engine --> Diesel_ECO-5");
        System.out.println("update for car b engine capacity --> 2.2");
        Equipment bEquipment = b.getEquipment();
        bEquipment.setTypeEngine("Diesel_ECO-5");
        bEquipment.setEngineCapacity(2.2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());






    }
}

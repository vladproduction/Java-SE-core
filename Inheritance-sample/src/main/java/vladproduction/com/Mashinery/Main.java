package vladproduction.com.Mashinery;

public class Main {
    public static void main(String[] args) {

        Mashinery vehicle = new Mashinery();
        vehicle.driving();

        Cars Maclaren = new Cars();
        Maclaren.formula1();
        Maclaren.expensive();
        Maclaren.driving();

        Buses Icarus = new Buses();
        Icarus.driving();
        Icarus.transportingPeople();

        Tractors JohnDeer = new Tractors();
        JohnDeer.powerAgro();
        JohnDeer.driving();

        Trains trains = new Trains();
        trains.driving("railway");
        trains.driving(28);
        trains.driving();
    }
}

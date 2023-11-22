package Block_Initialization.ch03;

import Block_Initialization.ch03.Air.Air;
import Block_Initialization.ch03.Air.CargoAir;
import Block_Initialization.ch03.Air.Jets;
import Block_Initialization.ch03.Air.PassengerAir;
import Block_Initialization.ch03.Ferry.Container_Ship;
import Block_Initialization.ch03.Ferry.Ferry;
import Block_Initialization.ch03.Ferry.FerryBoat;
import Block_Initialization.ch03.Ferry.Tanker;
import Block_Initialization.ch03.Rail.Intercity;
import Block_Initialization.ch03.Rail.PassengerTrain;
import Block_Initialization.ch03.Rail.Rail;
import Block_Initialization.ch03.Rail.Tram;
import Block_Initialization.ch03.Road.Buss;
import Block_Initialization.ch03.Road.Car;
import Block_Initialization.ch03.Road.Road;
import Block_Initialization.ch03.Road.Track;

public class Main03 {
    public static void main(String[] args) {
        Transport transport = new Transport();
        System.out.println();

        Air air = new Air();
        System.out.println();
        PassengerAir passAir = new PassengerAir();
        Jets jet = new Jets();
        CargoAir cargoAir = new CargoAir();
        System.out.println();

        Ferry ferry = new Ferry();
        System.out.println();
        Container_Ship container_ship = new Container_Ship();
        FerryBoat ferryBoat = new FerryBoat();
        Tanker tanker = new Tanker();
        System.out.println();

        Rail rail = new Rail();
        System.out.println();
        Intercity intercity = new Intercity();
        PassengerTrain passengerTrain = new PassengerTrain();
        Tram tram = new Tram();
        System.out.println();

        Road road = new Road();
        System.out.println();
        Car car = new Car();
        Track track = new Track();
        Buss buss = new Buss();




    }
}

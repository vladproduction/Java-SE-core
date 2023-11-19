package vladproduction.com.app07;

import java.util.ArrayList;
import java.util.List;

public class Car {

    Engine engine;
    List<Wheel> wheels;

    Freshener freshener;

    public Car() {
        //composition
        this.engine = new Engine();
        wheels = new ArrayList<>();
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
    }

    public Car(Freshener freshener) {
        //aggregation
        this.freshener = freshener;
        //composition
        this.engine = new Engine();
        wheels = new ArrayList<>();
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
    }

    //delegating
    public void drive(){
        this.engine.drive();
        for (Wheel wheel: wheels) {
            wheel.drive();
        }
        if(freshener != null){
            System.out.println("Freshener include: " + isExist());
        }

    }

    private boolean isExist() {
        new Car(this.freshener);
        return true;
    }
}

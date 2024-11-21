package afs.training.oo;

public class Bus extends Vehicle {

    public Bus(String name, Integer speed, Engine engine) {
        super(name, speed, engine.getAcceleration());
    }
}

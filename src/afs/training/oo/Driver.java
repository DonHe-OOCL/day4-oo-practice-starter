package afs.training.oo;

public class Driver {

    private Vehicle vehicle;

    public Driver() {
    }

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.seepUp();
    }

}

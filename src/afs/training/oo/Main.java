package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Vehicle("Cool Bus", 25, 5);
//        bus.seepUp();

        Vehicle truck = new Vehicle("Big Truck", 20, 2);
//        truck.seepUp();

        Driver driver = new Driver(bus);
        driver.drive();

        driver = new Driver(truck);
        driver.drive();
    }
}
package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Cool Bus", 25, 5);
        bus.seepUp();

        Truck truck = new Truck("Big Truck", 20, 2);
        truck.seepUp();
    }
}
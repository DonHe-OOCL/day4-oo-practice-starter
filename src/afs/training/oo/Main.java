package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        Bus gasBus = new Bus("Gasoline Bus", 25, gasolineEngine);
        Bus electricBus = new Bus("electric Bus", 25, electricEngine);
        Driver driver = new Driver();
        driver.setVehicle(gasBus);
        driver.drive();

        driver.setVehicle(electricBus);
        driver.drive();

        Truck truck = new Truck("Big Truck", 20, 2);
        driver.setVehicle(truck);
        driver.drive();
    }
}
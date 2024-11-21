package afs.training.oo;

public class Truck {
    private String name;

    private Integer speed;

    private Integer acceleration;

    public Truck(String name, Integer speed, Integer acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public void seepUp() {
        speed += acceleration;
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}

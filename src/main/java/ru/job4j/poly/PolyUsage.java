package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Airplane air = new Airplane();
        Autobus autobus = new Autobus();
        Autobus bus = new Autobus();
        Train train = new Train();
        Train railcar = new Train();

        Vehicle[] vehicles = new Vehicle[]{airplane, autobus, train, air, bus, railcar};
        for (Vehicle a : vehicles) {
            a.move();
            a.fuel();
        }
    }
}

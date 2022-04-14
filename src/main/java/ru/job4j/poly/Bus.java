package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void askDrive() {
        askDrive();
    }

    @Override
    public void askPassengers(int numbers) {
        askPassengers(14);
    }

    @Override
    public int askRefuel(int litres) {
        int price = 5;
        return litres * price;
    }
}

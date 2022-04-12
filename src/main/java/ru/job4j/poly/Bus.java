package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void askDrive() {

    }

    @Override
    public void askPassengers(int numbers) {

    }

    @Override
    public int askRefuel(int litres) {
        int price = 5;
        return litres * price;
    }
}

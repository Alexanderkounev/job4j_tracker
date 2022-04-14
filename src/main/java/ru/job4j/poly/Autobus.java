package ru.job4j.poly;

public class Autobus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по скоростным трассам.");
    }

    @Override
    public void fuel() {
        System.out.println(getClass().getSimpleName() + " использует бензин.");
    }
}

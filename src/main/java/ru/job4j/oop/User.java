package ru.job4j.oop;

public class User {
    private String name; // поле объекта (находится в области класса)
    private int age; // поле объекта (находится в области класса)

    public boolean canDrive() {
        boolean can = false; // локальная переменная (находится внутри метода)
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}

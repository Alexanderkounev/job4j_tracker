package ru.job4j.oop;

public class User {
    /**
     *  поле объекта (находится в области класса).
     */
    private String name;
    /**
     *  поле объекта (находится в области класса).
     */
    private int age;

    public boolean canDrive() {
        /**
         *  can - локальная переменная  (находится внутри метода)/
         */
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}

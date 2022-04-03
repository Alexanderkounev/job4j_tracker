package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String cuts;

    public Surgeon(String name, String surname, String education, String birthday, String placeOfWork, String cuts) {
        super(name, surname, education, birthday, placeOfWork);
        this.cuts = cuts;
    }

    public Operation difficult(Operation pacient) {
        return pacient;
    }

}


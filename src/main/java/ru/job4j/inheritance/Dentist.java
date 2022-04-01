package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String specialization;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Specialization Dent(Specialization specialization) {
        return specialization;
    }

}

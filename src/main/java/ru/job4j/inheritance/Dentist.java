package ru.job4j.inheritance;

public class Dentist extends Doctor  {

    private String specialization;

    public Dentist(String name, String surname, String education, String birthday, String placeOfWOrk, String specialization) {
        super(name, surname, education, birthday, placeOfWOrk);
        this.specialization = specialization;
    }

    public Specialization dent(Specialization specialization) {
        return specialization;
    }

}

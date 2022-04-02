package ru.job4j.inheritance;

public class Doctor extends Profession  {

    private String placeOfWork;

    public Doctor(String name, String surname, String education, String birthday, String placeOfWork) {
        super(name, surname, education, birthday);
        this.placeOfWork = placeOfWork;
        }

    public Doctor work(Doctor place) {
        return place;
    }
}

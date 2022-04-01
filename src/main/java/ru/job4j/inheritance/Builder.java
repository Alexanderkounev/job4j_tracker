package ru.job4j.inheritance;

public class Builder extends Engineer  {

    private String object;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public House material(House brick) {
        return brick;
    }

}

package ru.job4j.inheritance;

public class Builder extends Engineer  {

    private String object;

    public Builder(String name, String surname, String education, String birthday, String rank, String object) {
        super(name, surname, education, birthday, rank);
        this.object = object;
    }

    public House material(House brick) {
        return brick;
    }

}

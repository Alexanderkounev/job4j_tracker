package ru.job4j.inheritance;

public class Engineer extends Profession  {

    private String rank;

    public Engineer(String name, String surname, String education, String birthday, String rank) {
        super(name, surname, education, birthday);
        this.rank = rank;
    }

    public Engineer rank(Engineer rank) {
        return rank;
    }
}

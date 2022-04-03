package ru.job4j.inheritance;

import java.util.logging.Level;

public class Programmer extends Engineer  {

    private String level;

    public Programmer(String name, String surname, String education, String birthday, String rank, String level) {
        super(name, surname, education, birthday, rank);
        this.level = level;
    }

    public Level code(Level level) {
        return level;
    }

}

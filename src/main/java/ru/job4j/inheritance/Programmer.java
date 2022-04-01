package ru.job4j.inheritance;

import java.util.logging.Level;

public class Programmer extends Engineer {

    private String level;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Level code(Level level) {
        return level;
    }

}

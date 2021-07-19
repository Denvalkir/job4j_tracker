package ru.job4j.profession;

public class Programmer extends Engineer {
    private String computer;

    public Programmer(String computer) {
        this.computer = computer;
    }

    public Programmer(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getComputer() {
        return getComputer();
    }
}

package ru.job4j.profession;

public class Builder extends Engineer {
    private char sex;

    public Builder(char sex) {
        this.sex = sex;
    }

    public Builder(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public char getSex() {
        return getSex();
    }
}

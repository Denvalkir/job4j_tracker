package ru.job4j.profession;

public class Builder extends Engineer {
    private char sex;

    public Builder(String name, String surname, boolean education,
                   String birthday, double money, char sex) {
        super(name, surname, education, birthday, money);
        this.sex = sex;
    }

    public char getSex() {
        return getSex();
    }
}

package ru.job4j.profession;

public class Engineer extends Profession {
    private double money;

    public Engineer() {

    }

    public Engineer(double money) {
        this.money = money;
    }

    public Engineer(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public double getMoney() {
        return getMoney();
    }
}

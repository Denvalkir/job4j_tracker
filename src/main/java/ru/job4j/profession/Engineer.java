package ru.job4j.profession;

public class Engineer extends Profession {
    private double money;

    public Engineer(String name, String surname, boolean education, String birthday, double money) {
        super(name, surname, education, birthday);
        this.money = money;
    }

    public double getMoney() {
        return getMoney();
    }
}

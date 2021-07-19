package ru.job4j.profession;

public class Doctor extends Profession {
    private int ageExp;

    public Doctor() {
    }

    public Doctor(int ageExp) {
        this.ageExp = ageExp;
    }

    public Doctor(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getAgeExp() {
        return getAgeExp();
    }
}

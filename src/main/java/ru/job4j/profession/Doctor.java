package ru.job4j.profession;

public class Doctor extends Profession {
    private int ageExp;

    public Doctor(String name, String surname, boolean education, String birthday, int ageExp) {
        super(name, surname, education, birthday);
        this.ageExp = ageExp;
    }

    public int getAgeExp() {
        return getAgeExp();
    }
}

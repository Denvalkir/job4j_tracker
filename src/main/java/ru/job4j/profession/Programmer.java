package ru.job4j.profession;

public class Programmer extends Engineer {
    private String computer;

    public Programmer(String name, String surname, boolean education,
                      String birthday, double money, String computer) {
        super(name, surname, education, birthday, money);
        this.computer = computer;
    }

    public String getComputer() {
        return getComputer();
    }
}

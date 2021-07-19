package ru.job4j.profession;

public class Dentist extends Doctor {
    private int categoryDoc;

    public Dentist(int categoryDoc) {
        this.categoryDoc = categoryDoc;
    }

    public Dentist(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public int getCategoryDoc() {
        return getCategoryDoc();
    }
}

package ru.job4j.profession;

public class Dentist extends Doctor {
    private int categoryDoc;

    public Dentist(String name, String surname, boolean education,
                   String birthday, int ageExp, int categoryDoc) {
        super(name, surname, education, birthday, ageExp);
        this.categoryDoc = categoryDoc;
    }

    public int getCategoryDoc() {
        return getCategoryDoc();
    }
}

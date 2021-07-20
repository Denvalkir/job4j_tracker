package ru.job4j.profession;

public class Therapist extends Doctor {
    private int age;

    public Therapist(String name, String surname, boolean education,
                     String birthday, int ageExp, int age) {
        super(name, surname, education, birthday, ageExp);
        this.age = age;
    }

    public int getAge() {
        return getAge();
    }
}


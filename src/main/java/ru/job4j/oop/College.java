package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /* создаем объекта класса Freshman. */
        Freshman freshman = new Freshman();
        /* делаем повышающее приведение к типу родителя Student. */
        Student student = freshman;
        /* делаем повышающее приведение к типу родителя Object. */
        Object obj = freshman;

    }
}

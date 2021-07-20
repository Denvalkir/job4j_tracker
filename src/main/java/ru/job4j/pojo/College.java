package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Вася Пупкин");
        student.setGroup("4а1");
        student.setDateOfAdmission(new Date(121, 6, 20, 12, 20));

        String s = System.lineSeparator();

        System.out.println("ФИО студента: " + student.getFio() + s + "учится в группе: "
                + student.getGroup() + s + "дата поступления: " + student.getDateOfAdmission());
    }
}

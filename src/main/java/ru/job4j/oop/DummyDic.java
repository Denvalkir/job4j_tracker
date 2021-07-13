package ru.job4j.oop;

public class DummyDic {
    public String engTorus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        System.out.println(dic.engTorus("end"));
    }
}

package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String s = System.lineSeparator();
        return "{" + s + "\"" + name + "\" : name," + s + "\"" + body + "\" : body" + s + "}";
    }
}

package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        JSONReport reports = new JSONReport();
        String texts = reports.generate("Report's name", "Report's body");
        System.out.println(texts);
    }
}
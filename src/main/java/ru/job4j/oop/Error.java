package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активный: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Комментарий: " + message);
    }

    public static void main(String[] args) {
        Error errFirst = new Error(true, 1, "Тут будет комментарий");
        errFirst.printInfo();
        Error errSecond = new Error();
        errSecond.printInfo();
    }
}

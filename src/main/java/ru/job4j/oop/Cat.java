package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        return "may-may";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);

        Cat gav = new Cat();
        System.out.println("There are gav's nick.");
        gav.giveNick("gav");
        System.out.println("There are gav's food.");
        gav.eat("kotleta");
        gav.show();

        Cat black = new Cat();
        System.out.println("There are black's nick.");
        black.giveNick("black");
        System.out.println("There are black's food.");
        black.eat("fish");
        black.show();
    }
}
package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery bat1 = new Battery(10);
        Battery bat2 = new Battery(5);
        bat1.exchange(bat2);
        System.out.println(bat1.load);
        System.out.println(bat2.load);
    }
}

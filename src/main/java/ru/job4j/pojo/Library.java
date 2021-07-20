package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookFirst = new Book("Clean code", 100);
        Book bookSecond = new Book("Букварь", 20);
        Book bookThird = new Book("Колобок", 5);
        Book bookFourth = new Book("Java", 4000);
        Book[] books = new Book[4];
        books[0] = bookFirst;
        books[1] = bookSecond;
        books[2] = bookThird;
        books[3] = bookFourth;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCountPages());
        }
        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCountPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCountPages());
            }
        }
    }
}

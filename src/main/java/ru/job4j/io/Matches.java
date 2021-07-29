package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3. Осталось " + count + " спичек");
            int matches = Integer.parseInt(input.nextLine());
            boolean rsl = matches < 4 && matches > 0;
            if (rsl) {
                turn = !turn;
                count = count - matches;
            } else {
                System.out.println("Вы ошиблись!");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
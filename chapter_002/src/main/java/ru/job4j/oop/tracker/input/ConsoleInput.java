package ru.job4j.oop.tracker.input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr (String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt (String question) {
        return Integer.parseInt(scanner.nextLine());
    }

    /*private final Scanner scanner = new Scanner(System.in);

    @Override
    public String input() {
        return scanner.nextLine();
    }

    @Override
    public String askStr (String question) {
        return question;
    }

    @Override
    public int askInt (String question) {
        return Integer.parseInt(scanner.nextLine());
    }*/
}
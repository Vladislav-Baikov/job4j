package ru.job4j.oop.tracker.input;

public class StabInput implements Input {

    private final String[] answers;
    private int position = 0;

    public StabInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String input() {
        String result = answers[position];
        position++;
        return result;
    }
}

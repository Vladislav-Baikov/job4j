package ru.job4j.oop.tracker.input;

public class StubInput implements Input {

    private final String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String input() {
        String result = answers[position];
        position++;
        return result;
    }

    @Override
    public String askStr(){
        return null;
    }

    @Override
    public int askInt(){
        return null;
    }
}

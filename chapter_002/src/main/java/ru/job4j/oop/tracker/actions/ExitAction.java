package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.output.Output;

public class ExitAction implements Action {

    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }
}

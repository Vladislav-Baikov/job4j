package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Tracker;
import ru.job4j.oop.tracker.ui.StartUI2;

public class ExitAction implements Action {

    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}

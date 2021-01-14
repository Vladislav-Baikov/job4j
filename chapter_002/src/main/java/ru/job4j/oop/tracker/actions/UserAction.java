package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.output.StubOutput;
import ru.job4j.oop.tracker.tracker.Tracker;

public class UserAction {
    public void ShowAllItemsAction(ConsoleOutput out) {
    }
    public boolean execute(Input input, Tracker tracker) {
        return true;
    }
}

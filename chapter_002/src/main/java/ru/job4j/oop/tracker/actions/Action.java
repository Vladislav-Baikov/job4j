package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Tracker;

public interface Action {
    void doAction(Input input, Tracker tracker);
}

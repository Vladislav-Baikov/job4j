package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindAllAction implements Action {

    @Override
    public void doAction (Input input, Tracker tracker) {
        Item[] allItems = tracker.findAll();
        System.out.println("List of all Items:");
        for (int i = 0; i < allItems.length; i++) {
            Output output = new ConsoleOutput();
            output.println(allItems[i]);
        }
    }
}

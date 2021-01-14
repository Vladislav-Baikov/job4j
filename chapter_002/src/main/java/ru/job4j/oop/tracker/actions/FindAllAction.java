package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindAllAction implements Action {

    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find all Items ===");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            out.println(items[i]);
        }
        return true;
    }

    /*@Override
    public void doAction (Input input, Tracker tracker) {
        Item[] allItems = tracker.findAll();
        System.out.println("List of all Items:");
        for (int i = 0; i < allItems.length; i++) {
            Output output = new ConsoleOutput();
            output.println(allItems[i]);
        }
    }*/
}

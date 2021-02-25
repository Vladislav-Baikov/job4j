package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindByNameAction implements Action {

    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                out.println(items[i]);
            }
        } else {
            out.println("Items with entered name was not found");
        }
        return true;
    }
}

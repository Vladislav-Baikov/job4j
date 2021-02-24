package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class EditAction implements Action {

    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit a Item ===");
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter name of new Item: ");
        Item newItem = new Item(name);
        tracker.replace(id, newItem);
        return true;
    }
}

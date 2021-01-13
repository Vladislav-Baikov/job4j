package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindByIdAction implements Action {

    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by Id ===");
        String id = input.askStr("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Item with entered Id was not found");
        }
        return true;
    }

    /*@Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter id of Item you want to find: ");
        String id = input.input();
        Item findItem = tracker.findById(id);
        if (findItem == null) {
            System.out.println("Item with entered id is not found");
        } else {
            Output output = new ConsoleOutput();
            output.println(findItem);
        }
    }*/
}

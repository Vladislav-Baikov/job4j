package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindByNameAction implements Action {

    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by name ===");
        String name = input.askStr("Enter name: ");
        out.println(tracker.findByName(name));
        return true;
    }

    /*@Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter name of Item-s you want to find: ");
        String name = input.input();
        Item[] findItem = tracker.findByName(name);
        if (findItem.length == 0) {
            System.out.println("Items with entered name is not found");
        } else {
            System.out.println("Found Items:");
            for (int i=0; i < findItem.length; i++) {
                Output output = new ConsoleOutput();
                output.println(findItem[i]);
            }
        }
    }*/
}

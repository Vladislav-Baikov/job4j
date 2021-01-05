package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class CreateAction implements Action {

    //private final Output out;

    /*public CreateAction(Output out) {
        this.out = out;
    }*/

    @Override
    public String name() {
        return "Create";
    }

    /*@Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }*/

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String itemName = input.input();
        if (itemName.length() == 0) {
            System.out.println("Fail");
        } else {
            Item addItem = new Item(itemName);
            tracker.add(addItem);
            Output consoleOutput = new ConsoleOutput();
            consoleOutput.println(addItem);
        }
    }
}

package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class CreateAction implements Action {

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String itemName = input.input();
        if (itemName.length() == 0) {
            System.out.println("Fail");
        } else {
            Item addItem = new Item(itemName, "desc", 1);
            tracker.add(addItem);
            Output consoleOutput = new ConsoleOutput();
            consoleOutput.println(addItem);
        }
    }
}

package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.StabOutput;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class CreateAction implements Action {

    @Override
    public String getName() {
        return "Create a new Item";
    }

    @Override
    public void doAction(Input input, Tracker tracker) {
        getName();
        System.out.print("Enter name: ");
        String itemName = input.input();
        String errorMassage = "--- Fail. The name must not be empty ---";
        String successMassage = "--- Success. Item created ---";
        ConsoleOutput consoleOutput = new ConsoleOutput(successMassage, errorMassage);
        StabOutput stabOutput = new StabOutput();
        if (itemName.length() == 0) {
            consoleOutput.outputError();
            stabOutput.outputError();
        } else {
            Item addItem = new Item(itemName, "desc", 1);
            tracker.add(addItem);
            consoleOutput.outputSuccess();
            stabOutput.outputSuccess();
        }
    }
}

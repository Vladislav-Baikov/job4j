package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindByIdAction implements Action {

    @Override
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
    }
}

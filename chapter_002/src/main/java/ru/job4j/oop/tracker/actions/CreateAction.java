package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class CreateAction implements Action {
    private String name;

    @Override
    public String getName() {
        name = "Create a new Item";
        return name;
    }

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String itemName = input.input();
        if (itemName.length() == 0) {
            System.out.println("Fail. The name is empty");
        } else {
            Item addItem = new Item(itemName, "desc", 1);
            tracker.add(addItem);
            System.out.println("Item created");
        }
    }
}

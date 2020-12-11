package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class EditAction implements Action {
    private String name;

    @Override
    public String getName() {
        name = "Edit Item";
        return name;
    }

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter id of Item to change: ");
        String id = input.input();
        System.out.print("Enter new name of Item: ");
        String name = input.input();
        Item newItem = new Item(name, "new", 1);
        if (tracker.replace(id, newItem)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}

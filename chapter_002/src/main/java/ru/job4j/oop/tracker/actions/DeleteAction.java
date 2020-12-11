package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Tracker;

public class DeleteAction implements Action{
    private String name;

    @Override
    public String getName() {
        name = "Delete Item";
        return name;
    }

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter id of Item you want to delete: ");
        String id = input.input();
        if (tracker.delete(id)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}

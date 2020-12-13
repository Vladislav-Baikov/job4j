package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

public class FindByNameAction implements Action {
    private String name;

    @Override
    public String getName() {
        name = "Find Item by name";
        return name;
    }

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter name of Item-s you want to find: ");
        String name = input.input();
        Item[] findItem =  tracker.findByName(name);
        if (findItem.length == 0) {
            System.out.println("Items with entered name is not found");
        } else {
            System.out.println("Found Items:");
            for (int i=0; i < findItem.length; i++) {
                System.out.println(findItem[i]);
            }
        }
    }
}
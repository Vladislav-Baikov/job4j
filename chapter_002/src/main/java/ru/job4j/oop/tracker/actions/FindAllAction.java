package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

import java.util.ArrayList;
import java.util.List;

public class FindAllAction implements Action {

    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find all Items ===");
        List<Item> items = tracker.findAll();
        for (Item itemI: items) {
            System.out.println(itemI);
        }
        return true;
    }
}

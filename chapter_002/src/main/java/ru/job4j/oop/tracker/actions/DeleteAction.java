package ru.job4j.oop.tracker.actions;

import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Tracker;

public class DeleteAction implements Action{

    @Override
    public void doAction(Input input, Tracker tracker) {
        System.out.print("Enter id of Item you want to delete: ");
        String id = input.input();
        if (tracker.delete(id)) {
            Output output = new ConsoleOutput();
            output.println(id);
        } else {
            System.out.println("Fail");
        }
    }
}

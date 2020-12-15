package ru.job4j.oop.tracker.ui;

import ru.job4j.oop.tracker.actions.*;
import ru.job4j.oop.tracker.input.ConsoleInput;
import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Tracker;

public class StartUI {

    public void actionExecutor(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.input());
            if (select == 0) {
                CreateAction createAction = new CreateAction();
                createAction.doAction(input, tracker);
            } else if (select == 1) {
                FindAllAction findAllAction = new FindAllAction();
                findAllAction.doAction(input, tracker);
            } else if (select == 2) {
                EditAction editAction = new EditAction();
                editAction.doAction(input, tracker);
            } else if (select == 3) {
                DeleteAction deleteAction = new DeleteAction();
                deleteAction.doAction(input, tracker);
            } else if (select == 4) {
                FindAllAction findAllAction = new FindAllAction();
                findAllAction.doAction(input, tracker);
            } else if (select == 5) {
                FindByNameAction findByNameAction = new FindByNameAction();
                findByNameAction.doAction(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        new StartUI().actionExecutor(new ConsoleInput(), new Tracker());
    }
}

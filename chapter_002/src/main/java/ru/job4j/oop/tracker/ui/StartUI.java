package ru.job4j.oop.tracker.ui;

import ru.job4j.oop.tracker.actions.CreateAction;
import ru.job4j.oop.tracker.actions.EditAction;
import ru.job4j.oop.tracker.actions.FindAllAction;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.input.ConsoleInput;
import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.tracker.Tracker;

public class StartUI {
    //private final Output out;
   /* public StartUI(Output out) {
        this.out = out;
    }*/
    /*String[] programActions;

    StartUI() {
        programActions[];
    }*/

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
                System.out.println("=== Delete Item ====");
                System.out.print("Enter id of Item you want to delete: ");
                String id = input.input();
                if (tracker.delete(id)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by id ====");
                System.out.print("Enter id of Item you want to find: ");
                String id = input.input();
                Item findItem = tracker.findById(id);
                if (findItem == null) {
                    System.out.println("Item with entered id is not found");
                } else {
                    System.out.println("Found Item:");
                    System.out.println(findItem.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Find Items by name ====");
                System.out.print("Enter name of Items you want to find: ");
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
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /*private void showMenu(answers) {
        out.println("Menu.");
        for (int index = 0; index < programActions.length; index++) {
            out.println(index + ". " + programActions[index].name());
        }
    }*/
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

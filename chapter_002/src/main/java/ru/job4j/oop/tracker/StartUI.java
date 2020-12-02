package ru.job4j.oop.tracker;

public class StartUI {

    public void actionExecutor(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.input());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.input();
                if (name.length() == 0) {
                    System.out.println("Fail. The name is empty");
                } else {
                    Item addItem = new Item(name, "desc", 1);
                    tracker.add(addItem);
                    System.out.println("Item created");
                }
            } else if (select == 1) {
                Item[] allItems = tracker.findAll();
                System.out.println("List of all Items:");
                for (int i=0; i < allItems.length; i++) {
                    System.out.println(allItems[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
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

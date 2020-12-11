package ru.job4j.oop.tracker.ui;

public class StartUITwo {
    /*private final Output out;

    public StartUITwo(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, String[] answers) {
        boolean run = true;
        while (run) {
            this.showMenu(answers);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(answers) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit()
                *//* another actions *//*
        };
        new StartUI(output).init(input, tracker, actions);
    }*/
}

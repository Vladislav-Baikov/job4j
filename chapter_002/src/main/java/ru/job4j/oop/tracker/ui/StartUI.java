package ru.job4j.oop.tracker.ui;

import ru.job4j.oop.tracker.actions.*;
import ru.job4j.oop.tracker.input.ConsoleInput;
import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.input.ValidateInput;
import ru.job4j.oop.tracker.output.ConsoleOutput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.tracker.Tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, Action[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            Action action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(Action[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        Action[] actions = {
                new CreateAction(output),
                new DeleteAction(output),
                new EditAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new FindAllAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}

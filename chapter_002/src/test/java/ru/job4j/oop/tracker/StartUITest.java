package ru.job4j.oop.tracker;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.tracker.actions.*;
import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.input.StubInput;
import ru.job4j.oop.tracker.output.Output;
import ru.job4j.oop.tracker.output.StubOutput;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;
import ru.job4j.oop.tracker.ui.StartUI;

import static org.hamcrest.Matchers.is;

public class StartUITest {

    /*@Test
    public void whenCreateItem() {
        Input stabInput = new StubInput(new String[] {"0", "Item name", "6"});
        Tracker tracker = new Tracker();
        new StartUI().actionExecutor(stabInput, tracker);
        Assert.assertThat("Item name", is (tracker.findAll()[0].getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("name", "", 1)).getId();
        Input stabInput = new StubInput(new String[] {"2", id, "newName", "6"});
        new StartUI().actionExecutor(stabInput, tracker);
        Assert.assertThat("newName", is (tracker.findAll()[0].getName()));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("name", "", 1)).getId();
        Input stabInput = new StubInput(new String[] {"3", id, "6"});
        new StartUI().actionExecutor(stabInput, tracker);
        Item allItems[] = tracker.findAll();
        Assert.assertThat(allItems.length, is (0));
    }*/

    @Test
    public void  whenFindAllItems() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("New Item")).getId();
        Input in = new StubInput(
                new String[] {"0", "1"});
        Action[] actions = {
                new FindAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Find all Items" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "=== Find all Items ===" + System.lineSeparator()
                + "Item{id='" + id + "', name='New Item'}" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find all Items" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "=== Exit Program ===" + System.lineSeparator()));
    }

    @Test
    public void  whenFindByIdItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("New Item")).getId();
        Input in = new StubInput(
                new String[] {"0", id, "1"});
        Action[] actions = {
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by Id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Find Item by Id ===" + System.lineSeparator()
                        //+ "Enter Id: "+ id + System.lineSeparator()
                        + "Item{id='" + id + "', name='New Item'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Item by Id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Exit Program ===" + System.lineSeparator()));
    }

    @Test
    public void  whenFindByNameItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("New Item")).getId();
        Input in = new StubInput(
                new String[] {"0", "New Item", "1"});
        Action[] actions = {
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Assert.assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by Name" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Find Item by name ===" + System.lineSeparator()
                        //+ "Enter name: New Item" + System.lineSeparator()
                        + "Item{id='" + id + "', name='New Item'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Item by Name" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "=== Exit Program ===" + System.lineSeparator()));
    }
}

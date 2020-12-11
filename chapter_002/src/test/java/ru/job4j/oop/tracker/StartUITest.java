package ru.job4j.oop.tracker;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.input.StabInput;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;
import ru.job4j.oop.tracker.ui.StartUI;

import static org.hamcrest.Matchers.is;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input stabInput = new StabInput(new String[] {"0", "Item name", "6"});
        Tracker tracker = new Tracker();
        new StartUI().actionExecutor(stabInput, tracker);
        Assert.assertThat("Item name", is (tracker.findAll()[0].getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("name", "", 1)).getId();
        Input stabInput = new StabInput(new String[] {"2", id, "newName", "6"});
        new StartUI().actionExecutor(stabInput, tracker);
        Assert.assertThat("newName", is (tracker.findAll()[0].getName()));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        String id = tracker.add(new Item("name", "", 1)).getId();
        Input stabInput = new StabInput(new String[] {"3", id, "6"});
        new StartUI().actionExecutor(stabInput, tracker);
        Item allItems[] = tracker.findAll();
        Assert.assertThat(allItems.length, is (0));
    }

    @Test
    public void  whenFindAllItems () {

    }

    @Test
    public void  whenFindByNameItem () {

    }

    @Test
    public void  whenFindByIdItem () {

    }
}

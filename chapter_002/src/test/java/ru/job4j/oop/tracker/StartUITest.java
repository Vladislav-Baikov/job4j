package ru.job4j.oop.tracker;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.tracker.input.Input;
import ru.job4j.oop.tracker.input.StubInput;
import ru.job4j.oop.tracker.output.StubOutput;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;
import ru.job4j.oop.tracker.ui.StartUI;

import static org.hamcrest.Matchers.is;

public class StartUITest {

    @Test
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
    }

    @Test
    public void  whenFindAllItems () {
        Tracker tracker = new Tracker();
        for (int i = 0; i < 5; i++) {
            tracker.add(new Item("", "", 1));
        }
        Input stubInput = new StubInput(new String[] {"1", "6"});
        new StartUI().actionExecutor(stubInput, tracker);
        Item allItems[] = tracker.findAll();
        Assert.assertThat(allItems.length, is (5));
    }

    @Test
    public void  whenFindByIdItem () {
        Tracker tracker = new Tracker();
        tracker.add(new Item("name", "", 1));
        String id = (tracker.findByName("name")[0]).getId();
        Input stubInput = new StubInput(new String[] {"4", id, "6"});
        new StartUI().actionExecutor(stubInput, tracker);
        Assert.assertThat(tracker.findById(id).getName(), is ("name"));
    }

    @Test
    public void  whenFindByNameItem () {
        Tracker tracker = new Tracker();
        for (int i = 0; i < 3; i++) {
            tracker.add(new Item("name", "", 1));
        }
        Input stubInput = new StubInput(new String[] {"5", "name", "6"});
        new StartUI().actionExecutor(stubInput, tracker);
        Item foundItems[] = tracker.findByName("name");
        Assert.assertThat(foundItems.length, is (3));
    }
}

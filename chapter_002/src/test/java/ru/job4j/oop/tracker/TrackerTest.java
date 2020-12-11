package ru.job4j.oop.tracker;

import org.junit.Test;
import ru.job4j.oop.tracker.tracker.Item;
import ru.job4j.oop.tracker.tracker.Tracker;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDesc", 123L);
        tracker.add(item);
        Item result = tracker.findByName("test1")[0];
        assertThat(result, is(item));
    }

    @Test
    public void whenDeleteItemThenRemainingItemsWillBeMoved() {
        Tracker tracker = new Tracker();
        Item itemOne = new Item("test1", "testDesc1", 123L);
        Item itemTwo = new Item("test2", "testDesc2", 321L);
        tracker.add(itemOne);
        tracker.add(itemTwo);
        tracker.delete(itemOne.getId());
        assertThat(tracker.findAll()[0].getName(), is("test2"));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        boolean result = true;
        tracker.add(new Item("mail", "mailDesc", 2L));
        Item[] arr = tracker.findAll();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result = false;
                break;
            }
        }
        assertThat(result, is(true));
    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDesc1", 123L);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }
}
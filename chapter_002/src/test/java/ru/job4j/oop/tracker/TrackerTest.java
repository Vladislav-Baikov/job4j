package ru.job4j.oop.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1","testDescription",created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        Item next = new Item("test2","testDescription2",1234L);
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
        long createdOne = System.currentTimeMillis();
        long createdTwo = System.currentTimeMillis();
        Item itemOne = new Item("test1","testDesc", createdOne);
        Item itemTwo = new Item("test2", "testDesc", createdTwo);
        tracker.add(itemOne);
        tracker.add(itemTwo);
        itemTwo.setId(itemOne.getId());
        tracker.delete(itemOne.getId());
        //assertThat(itemOne., is());
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        boolean result = true;
        tracker.add(new Item("mail", "mailDesc", 2L));
        Item[] arr = tracker.findAll();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                result = false;
                break;
            }
        }
        assertThat(result, is(true));
    }
}
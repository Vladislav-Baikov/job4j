package ru.job4j.oop.tracker.sort;

import org.junit.Test;
import java.util.List;
import ru.job4j.oop.tracker.tracker.Item;
import java.util.*;

public class ItemSorterTest {

    @Test
    public void itemSort() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("d"));
        items.add(new Item("b"));
        items.add(new Item("c"));
        items.add(new Item("a"));
        System.out.println(items);
        items.sort(new ItemSorter());
        System.out.println(items);
    }
}
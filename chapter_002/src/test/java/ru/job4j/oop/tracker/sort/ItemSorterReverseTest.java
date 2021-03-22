package ru.job4j.oop.tracker.sort;

import org.junit.Test;
import ru.job4j.oop.tracker.tracker.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemSorterReverseTest {

    @Test
    public void itemSortReverse() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("a"));
        items.add(new Item("c"));
        items.add(new Item("b"));
        items.add(new Item("d"));
        System.out.println(items);
        items.sort(new ItemSorterReverse());
        System.out.println(items);
    }
}
package ru.job4j.oop.tracker.sort;

import org.junit.Test;
import ru.job4j.oop.tracker.tracker.Item;

import java.util.*;

import static org.junit.Assert.*;

public class ItemSorterAscendingTest{

    @Test
    public void sortAscending() {
        List<Item> items = Arrays.asList(
                new Item("c"),
                new Item("a"),
                new Item("d"),
                new Item("b")
        );
        Collections.sort(items);
    }
}
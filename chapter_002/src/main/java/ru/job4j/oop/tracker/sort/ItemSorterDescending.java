package ru.job4j.oop.tracker.sort;

import ru.job4j.oop.tracker.tracker.Item;

import java.util.Comparator;

public class ItemSorterDescending implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return reversed().compare(first, second);
    }
}

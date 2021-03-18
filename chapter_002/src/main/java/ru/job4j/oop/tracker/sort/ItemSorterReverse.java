package ru.job4j.oop.tracker.sort;

import ru.job4j.oop.tracker.tracker.Item;

import java.util.Comparator;

public class ItemSorterReverse implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return (first.getName().compareTo(second.getName())) * (-1);
    }
}

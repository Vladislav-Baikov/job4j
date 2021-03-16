package ru.job4j.oop.tracker.tracker;

import java.util.ArrayList;
import java.util.List;

public final class SingleTracker {

    private final Tracker tracker = new Tracker();

    private static SingleTracker instance = null;

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public int generateId() {
        return tracker.generateId();
    }

    public Item findById(String id) {
        return findById(id);
    }
}

package ru.job4j.oop.tracker.tracker;

import java.util.ArrayList;

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

    public ArrayList<Item> findAll() {
        return tracker.findAll();
    }

    public ArrayList<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public int generateId() {
        return tracker.generateId();
    }

    public Item findById(String id) {
        return findById(id);
    }
}

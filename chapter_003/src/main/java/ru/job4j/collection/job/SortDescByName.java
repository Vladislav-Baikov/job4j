package ru.job4j.collection.job;

import java.util.Comparator;

public class SortDescByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return second.getName().compareTo(first.getName());
    }
}

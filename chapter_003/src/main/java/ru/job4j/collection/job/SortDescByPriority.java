package ru.job4j.collection.job;

import java.util.Comparator;

public class SortDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(second.getPriority(), first.getPriority());
    }
}

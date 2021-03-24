package main.java.ru.job4j.collection.job;

import java.util.Comparator;

public class SortAscByPriority implements Comparator <Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(first.getPriority(), second.getPriority());
    }
}
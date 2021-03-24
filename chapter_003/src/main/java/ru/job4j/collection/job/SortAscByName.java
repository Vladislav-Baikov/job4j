package main.java.ru.job4j.collection.job;

import java.util.Comparator;

public class SortAscByName implements Comparator<Job> {
    @Override
    public int compare (Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}

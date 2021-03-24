package test.java.ru.job4j.collection.job;

import main.java.ru.job4j.collection.job.Job;
import main.java.ru.job4j.collection.job.SortDescByName;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDescByNameTest {
    @Test
    public void whenSortDescByName() {
        Comparator<Job> comp = new SortDescByName();
        ArrayList<Job> arrayList = new ArrayList<>();
        arrayList.add(new Job("a", 3));
        arrayList.add(new Job("c", 2));
        arrayList.add(new Job("b", 4));
        arrayList.add(new Job("d", 1));
        Collections.sort(arrayList, comp);
        System.out.println(arrayList);
    }
}
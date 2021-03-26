package test.java.ru.job4j.collection.job;

import ru.job4j.collection.job.Job;
import ru.job4j.collection.job.SortAscByPriority;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortAscByPriorityTest {
    @Test
    public void whenSortAskByPriority() {
        Comparator<Job> comp = new SortAscByPriority();
        ArrayList<Job> arrayList = new ArrayList<>();
        arrayList.add(new Job("a", 3));
        arrayList.add(new Job("c", 2));
        arrayList.add(new Job("b", 4));
        arrayList.add(new Job("d", 1));
        Collections.sort(arrayList, comp);
        System.out.println(arrayList);
    }
}
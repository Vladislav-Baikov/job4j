package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 04.03.19
 */
public class ArrayDublicateTest {
    /**
     * Тест удаления дубликатов.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDublicate test = new ArrayDublicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = test.remove(array);
        String[] expect = {"Привет", "Супер", "Мир"};
        assertThat(result, is(expect));
    }
}
package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 21.02.19
 */
public class CounterTest {
    /**
     * Тест диапазон 1 - 10, сумма четных элементов 30.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }
}

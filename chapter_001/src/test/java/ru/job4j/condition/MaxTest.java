package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 13.02.19
 */
public class MaxTest {
    /**
     * Тест если первое число меньше
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Тест если первое число больше
     */
    @Test
    public void whenFirstBiggerSecond() {
        Max maxim = new Max();
        int result = maxim.max(3, 1);
        assertThat(result, is(3));
    }
    /**
     * Тест для 3 чисел
     */
    @Test
    public void whenThreeNumbers() {
        Max test = new Max();
        int result = test.maxThree(3, 1, 2);
        assertThat(result, is(3));
    }
}
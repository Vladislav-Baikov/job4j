package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 26.02.19
 */

public class CheckTest {
    /**
     * Тест если нечетное количество, все True.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Тест если нечетное количество, True и False.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /**
     * Тест если нечетное количество, все False.
     */
    @Test
    public void whenDataMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Тест если четное количество, True и False.
     */
    @Test
    public void whenDataNotMonoByEvenTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, false, false, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
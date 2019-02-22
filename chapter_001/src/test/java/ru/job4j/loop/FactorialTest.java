package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 22.02.19
 */

public class FactorialTest {
    /**
     * Тест диапазон факториал 5 равен 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial test = new Factorial();
        int result = test.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Тест диапазон факториал 0 равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial test = new Factorial();
        int result = test.calc(0);
        assertThat(result, is(1));
    }
}


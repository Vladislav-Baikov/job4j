package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 01.03.19
 */
public class MatrixCheckTest {
    /**
     * Тест с одинаковыми диагоналями.
     */
    @Test
    public void whenDiagTrueThanTrue() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] table = {
                {true, false, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = matrix.mono(table);
        boolean expect = true;
        assertThat(result, is(expect));
    }
    /**
     * Тест с разными элементами на диагоналях.
     */
    @Test
    public void whenDiagFalseThanFalse() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] table = {
                {true, false, true},
                {false, false, true},
                {true, false, true}
        };
        boolean result = matrix.mono(table);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
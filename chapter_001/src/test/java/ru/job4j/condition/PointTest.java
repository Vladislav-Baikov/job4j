package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 13.02.19
 */
public class PointTest {
    /**
     * Test distanceTo
     */
    @Test
    public void distanceBetweenPoints() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        double result = a.distanceTo(b);
        double expect = 5;
        assertThat(result, is(expect));
    }
}
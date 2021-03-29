package ru.job4j.array;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 14.03.19
 */
public class ArrayMergeTest {
    /**
    * Слияние 2х отсортированных массивов
     **/
    @Test
    public void createMergedArrayFromTwoArrays() {
        ArrayMerge test = new ArrayMerge();
        int[] first = new int[]{1, 3, 5};
        int[] second = new int[]{2, 4};
        int[] result = test.merge(first, second);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, Matchers.is(expect));
    }
}

package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 28.02.19
 */
public class MatrixTest {
    /**
     * Тест построения матрицы 3 х 3.
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(3);
        int[][] expect = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(table, is(expect));
    }
}
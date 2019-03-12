package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 22.02.19
 */
public class TurnTest {
    /**
     * Тест поворота массива из четного количества элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    /**
     * Тест поворота массива из нечетного количества элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
            Turn turner = new Turn();
            int[] input = new int[]{3, 2, 5, 1, 6};
            int[] result = turner.back(input);
            int[] expect = new int[]{6, 1, 5, 2, 3};
            assertThat(result, is(expect));
    }
}

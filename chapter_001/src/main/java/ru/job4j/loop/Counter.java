package ru.job4j.loop;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 21.02.19
 */
public class Counter {
    /**
     * Считает сумму четных элементов.
     * @param start, finish Определение диапазона чисел.
     * @return summ Сумма четных элементов.
     */
    public int add(int start, int finish) {
        int summ = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                summ += i;
            }
        }
        return summ;
    }
}

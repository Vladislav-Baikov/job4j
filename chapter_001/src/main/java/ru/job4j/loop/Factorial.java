package ru.job4j.loop;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 22.02.19
 */

public class Factorial {
    /**
     * Считает Факториал числа.
     * @param n Задаваемое число.
     * @return fact Факториал заданного числа числа.
     */
    public int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

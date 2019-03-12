package ru.job4j.array;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 26.02.19
 */
public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp1 = array[i];
            int temp2 = array[array.length - i - 1];
            array[i] = temp2;
            array[array.length - i - 1] = temp1;
        }
        return array;
    }
}
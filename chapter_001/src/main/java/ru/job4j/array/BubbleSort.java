package ru.job4j.array;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 28.02.19
 */
public  class BubbleSort {
    public int[] sort(int[] array) {
        int a = 2;
        for (int i = array.length - 2; i >= 0; i--) {
            // цикл прохода по массиву
            for (int j = 0; j <= array.length - a; j++) {
                if (array[j] > array[j + 1]) {
                    //меняет местами элементы
                    int temp1 = array[j];
                    int temp2 = array[j + 1];
                    array[j] = temp2;
                    array[j + 1] = temp1;
                }
            }
            a++;
        }
        return array;
    }
}

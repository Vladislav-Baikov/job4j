package ru.job4j.array;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 14.03.19
 */
public class ArrayMerge {
    public int[] merge(int[] first, int[] second) {
        int[] array = new int[first.length + second.length];
        int markerFirst = 0;
        int markerSecond = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (first[markerFirst] < second[markerSecond]) {
                array[i] = first[markerFirst];
                array[i + 1] = second[markerSecond];
                markerFirst++;
            } else {
                array[i] = second[markerSecond];
                array[i + 1] = first[markerFirst];
                markerSecond++;
            }
        }
        return array;
    }
}
package ru.job4j.array;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 26.02.19
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
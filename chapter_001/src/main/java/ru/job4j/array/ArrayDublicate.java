package ru.job4j.array;
import java.util.Arrays;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 04.03.19
 */

public class ArrayDublicate {
    public String[] remove(String[] array) {
        int dublicates = 0;
        for (int i = 0; i < array.length - 1 - dublicates; i++) {       // Поиск дубликатов
            for (int j = 1; j < array.length - dublicates; j++) {
                if (array[i].equals(array[j])) {
                    String temp1 = array[j];          // Перестановка элементов
                    String temp2 = array[array.length - 1 - dublicates];
                    array[j] = temp2;
                    array[array.length - 1 - dublicates] = temp1;
                    dublicates++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - dublicates);
    }
}

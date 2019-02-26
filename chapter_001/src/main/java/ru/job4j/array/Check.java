package ru.job4j.array;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 26.02.19
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 2; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
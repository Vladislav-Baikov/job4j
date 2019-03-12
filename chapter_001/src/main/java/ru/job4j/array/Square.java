package ru.job4j.array;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 25.02.19
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
            for (int i = 0; i != bound; i++) {
                rst[i] = (int) Math.pow((i + 1), 2);
            }
        return rst;
    }
}
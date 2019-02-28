package ru.job4j.array;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 28.02.19
 */
public class Matrix {
    public int[][] multiple(int size) {
        int matrix[][] = new int[size][size];
        for (int i = 0; i <= matrix.length - 1; i++) { //столбец
            for (int j = 0; j <= matrix.length - 1; j++) { //строка
               matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return matrix;
    }
}

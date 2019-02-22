package ru.job4j.loop;

/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 22.02.19
 */
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            System.getProperty("line.separator");
            screen.append(ln);
        }
        return screen.toString();
    }
}
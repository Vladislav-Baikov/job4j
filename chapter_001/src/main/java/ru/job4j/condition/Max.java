package ru.job4j.condition;
/**
 * @author Vladislav Baikov (vagrant73@gmail.com)
 * @version v0.1
 * @since 20.02.19
 */
public class Max {
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    public int maxThree(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
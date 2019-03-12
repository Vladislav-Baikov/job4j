package ru.job4j.calculator;
public class Calculator {
    /**
     * Хранит результат
     */
    private double result;
    /**
     * Метод складывает два числа
     * @param first первая переменная
     * @param second вторая переменная
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Метод вычитает одно число из другого
     * @param first первая переменная
     * @param second вторая переменная
     */
    public void substract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Метод делит одно число на другое
     * @param first первая переменная
     * @param second вторая переменная
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Метод перемножает два числа
     * @param first первая переменная
     * @param second вторая переменная
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Метод возвращает результат от арифмитических действий
     */
    public double getResult() {
        return this.result;
    }
}
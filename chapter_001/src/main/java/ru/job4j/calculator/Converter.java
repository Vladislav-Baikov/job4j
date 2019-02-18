package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {

    /*
      1 доллар = 60 рублей.
      1 евро = 70 рублей.
     */
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        return (double) value / 70;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(int value) {
        return (double) value / 60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return Рубли
     */
    public int euroToRubles(int value) {
        return value * 70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Рубли
     */
    public int dollarsToRubles(int value) {
        return value * 60;
    }
}

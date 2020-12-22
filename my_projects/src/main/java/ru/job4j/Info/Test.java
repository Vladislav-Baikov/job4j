package ru.job4j.Info;

import java.util.Arrays;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class Test {
    public static void main(String[] args) {
        int[] testone = {1,2,3};
        int[] testtwo = {4,5,6};
        System.arraycopy(testone, 1, testtwo, 0, 2);
        System.out.println(Arrays.toString(testtwo));
    }
}
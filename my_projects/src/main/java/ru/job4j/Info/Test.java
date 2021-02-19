package ru.job4j.Info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] integers = new int[3];
        try {
            for (int i = 0; i < integers.length; i++) {
                System.out.print("Enter Integer " + (i + 1) + "\n");
                integers[Integer.parseInt(br.readLine())] = 2;
            }
        } catch(NumberFormatException nfe) {
            System.out.println("Invalid Format!");
        }
    }
}

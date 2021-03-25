package main.java.ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        ArrayList<Character> charsLeft = new ArrayList<>();
        ArrayList<Character> charsRight = new ArrayList<>();
        for (int i = 0; i < left.length(); i++) {
            charsLeft.add(left.charAt(i));
        }
        for (int i = 0; i < right.length(); i++) {
            charsRight.add(right.charAt(i));
        }

        if (left.length() < right.length()) {
            result = -1;
            for (int i = 0; i < left.length(); i++) {
                if (Character.compare(charsLeft.get(i), charsRight.get(i)) < 0) {
                    result = Character.compare(charsLeft.get(i), charsRight.get(i));
                    break;
                }
            }

        }

        if (left.length() > right.length()) {
            result = 1;
            for (int i = 0; i < right.length(); i++) {
                if (Character.compare(charsLeft.get(i), charsRight.get(i)) < 0) {
                    result = Character.compare(charsLeft.get(i), charsRight.get(i));
                    break;
                }
            }

        }
        /*for (int i = 0; i < left.length(); i++) {
            result = Character.compare(charsLeft.get(i), charsRight.get(i));
            if (result != 0) {
                break;
            }
        }
        if (right.length() > left.length() && result == 0) {
            result = -1;
        }*/
        return result;
    }
}


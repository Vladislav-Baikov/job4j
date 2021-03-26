package main.java.ru.job4j.collection;

import java.lang.reflect.Array;
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

        for (int i = 0; i < Math.min(charsLeft.size(), charsRight.size()); i++) {
            if (charsLeft.get(i) < charsRight.get(i)) {
                result = -1;
                break;
            }
            if (charsLeft.get(i) > charsRight.get(i)) {
                result = 1;
                break;
            }
        }
        if (charsLeft.size() < charsRight.size() && result == 0) {
            result = -1;
        }
        if (charsLeft.size() > charsRight.size() && result == 0) {
            result = 1;
        }
        return result;
    }
}


package com.cloudskol.javahub.p03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tham
 *
 * Find the alphabet order based on the given String and sum the order value
 */

public class Problem03 {
    public void findNumberByAlphabets(String value) {
        if (value == null || value.isEmpty()) {
            return;
        }

        int total = 0;
        char charValue;
        StringBuilder numberSeries = new StringBuilder();
        final char[] chars = value.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            charValue = chars[i];
            final int series = getNumberSeries(charValue);
            numberSeries.append(series);
            total += series;
        }

        System.out.println("Number series: " + numberSeries);
        System.out.println("Total of the series: " + total);
    }

    private int getNumberSeries(char charValue) {
        return alphaMap.get(String.valueOf(charValue));
    }

    static Map<String, Integer> alphaMap = new HashMap<String, Integer>(26);
    static {
        int index = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphaMap.put(String.valueOf(ch), index);
            index++;
        }

        System.out.println(alphaMap);
    }
}

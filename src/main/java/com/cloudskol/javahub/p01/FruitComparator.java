package com.cloudskol.javahub.p01;

import java.util.Comparator;

/**
 * @author tham
 *
 * Comparator for fruit object
 */

public class FruitComparator implements Comparator<Fruit> {

    public int compare(Fruit f1, Fruit f2) {
        int result = 0;
        if (f1.getSize() < f2.getSize()) {
            result = -1;
        } else if (f1.getSize() > f2.getSize()) {
            result = 1;
        }

        return result;
    }
}

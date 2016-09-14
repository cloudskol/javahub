package com.cloudskol.javahub.p01;

import java.util.List;

/**
 * @author tham
 */

public class Problem01 {
    public void findSmallAndBigSize() {
        final List<Fruit> fruits = FruitDataProvider.getInstance().getFruits();
        fruits.sort(new FruitComparator());
        System.out.println(fruits);
    }
}

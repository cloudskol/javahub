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

        final Fruit smallFruit = fruits.get(0);
        System.out.println("Small fruit: " + smallFruit);

        final Fruit bigFruit = fruits.get(fruits.size() - 1);
        System.out.println("Big fruit: " + bigFruit);
    }
}

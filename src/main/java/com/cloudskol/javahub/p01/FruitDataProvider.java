package com.cloudskol.javahub.p01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tham
 *
 * Data provider for fruit object
 */

public class FruitDataProvider {
    private static final FruitDataProvider INSTANCE = new FruitDataProvider();
    private static final String PREFIX = "FRUIT";

    private FruitDataProvider() {}

    public static synchronized final FruitDataProvider getInstance() {
        return INSTANCE;
    }

    public List<Fruit> getFruits() {
        final ArrayList<Fruit> fruits = new ArrayList<Fruit>(12);
        fruits.add(new Fruit(PREFIX + 0, FruitType.APPLE, Color.RED, 10));
        fruits.add(new Fruit(PREFIX + 1, FruitType.ORANGE, Color.ORANGE, 5));
        fruits.add(new Fruit(PREFIX + 2, FruitType.MANGO, Color.YELLOW, 25));
        fruits.add(new Fruit(PREFIX + 3, FruitType.MANGO, Color.RED, 8));
        fruits.add(new Fruit(PREFIX + 4, FruitType.APPLE, Color.YELLOW, 12));

        return fruits;
    }
}

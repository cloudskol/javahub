package com.cloudskol.javahub.p02;

import com.cloudskol.javahub.p01.Color;
import com.cloudskol.javahub.p01.Fruit;
import com.cloudskol.javahub.p01.FruitComparator;
import com.cloudskol.javahub.p01.FruitDataProvider;

import java.util.*;

/**
 * @author tham
 */

public class Problem02 {
    public void groupFruitsByColor() {
        final List<Fruit> fruits = FruitDataProvider.getInstance().getFruits();
        System.out.println("Fruits @Initial stage: " + fruits);

        Map<Color, List<Fruit>> colorMap = new HashMap<Color, List<Fruit>>(8);
        for (Fruit fruit : fruits) {
            groupFruit(colorMap, fruit);
        }

        System.out.println("Grouped Map: " + colorMap);

        List<Fruit> coloredFruits;
        final Set<Map.Entry<Color, List<Fruit>>> entries = colorMap.entrySet();
        for (Map.Entry<Color, List<Fruit>> entry : entries) {
            coloredFruits = entry.getValue();
            System.out.println("Number of fruits in " + entry.getKey() + " is " + coloredFruits.size());

            coloredFruits.sort(new FruitComparator());
            System.out.println("For " + entry.getKey() + " Min size is " + coloredFruits.get(0));
            System.out.println("For " + entry.getKey() + " Max size is " + coloredFruits.get(coloredFruits.size() - 1));
        }
    }

    private void groupFruit(Map<Color, List<Fruit>> colorMap, Fruit fruit) {
        List<Fruit> fruits = colorMap.get(fruit.getColor());
        if (fruits == null) {
            fruits = new ArrayList<Fruit>(2);
            colorMap.put(fruit.getColor(), fruits);
        }

        fruits.add(fruit);
    }
}

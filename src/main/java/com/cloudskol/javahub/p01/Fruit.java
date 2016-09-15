package com.cloudskol.javahub.p01;

/**
 * @author tham
 */

public class Fruit {
    private String id;
    private FruitType type;
    private Color color;
    private int size;

    public Fruit(String id, FruitType type) {
        this(id, type, Color.RED, 5);
    }

    public Fruit(String id, FruitType type, Color color, int size) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("{");
        builder.append("id: " + id + ", ");
        builder.append("type: " + type + ", ");
        builder.append("color: " + color + ", ");
        builder.append("size: " + size);
        builder.append("}");

        return builder.toString();
    }
}

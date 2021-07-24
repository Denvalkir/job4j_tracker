package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int sizeTempItems = 0;
        Item[] tempItems = new Item[size];
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                tempItems[sizeTempItems] = items[i];
                sizeTempItems++;
            }
        }
        return Arrays.copyOf(tempItems, sizeTempItems);
    }

    public Item[] findByName(String key) {
        int sizeTempItems = 0;
        Item[] tempItems = new Item[size];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                tempItems[sizeTempItems] = items[i];
                sizeTempItems++;
            }
        }
        return Arrays.copyOf(tempItems, sizeTempItems);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
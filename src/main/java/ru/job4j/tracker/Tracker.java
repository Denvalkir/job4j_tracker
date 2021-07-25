package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private static Item[] items = new Item[100];
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
        /* Находим индекс */
        int i = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return i != -1 ? items[i] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int i = indexOf(id);
        if (i != -1) {
            item.setId(id);
            items[i] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        items[indexOf(id)] = null;
        return true;
    }
}
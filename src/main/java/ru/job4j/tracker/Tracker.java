package ru.job4j.tracker;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class Tracker {
    private static Item[] items = new Item[100];
    private int ids = 1;
    private static int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] rsl = new Item[size];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[count++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    public Item findById(int id) {
        /* Находим индекс */
        int i = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return i != -1 ? items[i] : null;
    }

    private static int indexOf(int id) {
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

    public static boolean delete(int id) {
        boolean rsl = false;
        int i = indexOf(id);
        if (i != -1) {
            System.arraycopy(items, i + 1, items, i, items.length - 1 - i);
            rsl = true;
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}
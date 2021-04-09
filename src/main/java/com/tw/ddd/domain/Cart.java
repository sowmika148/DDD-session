package com.tw.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();
    private List<Item> deletedItems = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
        // Don't do any formatting logic inside domain objects
    }

    public void remove(Item item) {
        items.remove(item);
        deletedItems.add(item);
    }

    public List<Item> getDeletedItems() {
        return deletedItems;
    }
}

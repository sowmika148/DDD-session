package com.tw.ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<Item>();

    public void add(Item item) {
        items.add(item);
        // Don't do any formatting logic inside domain objects
    }

    public void remove(Item item) {
        items.remove(item);
    }
}

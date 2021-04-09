package com.tw.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {
    private List<Item> items = new ArrayList<>();
    private List<Item> deletedItems = new ArrayList<>();
    // Entities concept
    private String uuid;

    public Cart() {
        this.uuid = UUID.randomUUID().toString();
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return uuid.equals(cart.uuid);
    }
}

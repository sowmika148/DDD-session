package com.tw.ddd.application;

import com.tw.ddd.domain.Cart;
import com.tw.ddd.domain.Item;
import com.tw.ddd.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product productIpad = new Product("Ipad pro");
        Item itemIpad = new Item(productIpad, 1);
        cart.add(itemIpad);
        Product productPen = new Product("Hero ink Pen");
        Item itemPen = new Item(productPen, 1);
        cart.add(itemPen);
        Product productBat = new Product("GM Cricket bat");
        Item itemBat = new Item(productBat, 2);
        cart.add(itemBat);

        cart.remove(itemIpad);
        List<Item> deletedItems = cart.getDeletedItems();
        deletedItems.forEach(item -> System.out.println(item.getProduct().getName()));

        checkEquality();
    }

    private static void checkEquality() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Product productIpad = new Product("Ipad pro");
        Item itemIpad = new Item(productIpad, 1);
        cart1.add(itemIpad);
        cart2.add(itemIpad);
        System.out.println(cart1.equals(cart2));
    }
}

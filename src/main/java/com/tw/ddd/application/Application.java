package com.tw.ddd.application;

import com.tw.ddd.domain.Cart;
import com.tw.ddd.domain.Item;
import com.tw.ddd.domain.Price;
import com.tw.ddd.domain.Product;

import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Price priceIpad = new Price(100, Currency.getInstance("INR"));
        Product productIpad = new Product("Ipad pro", priceIpad);
        Item itemIpad = new Item(productIpad, 1);
        cart.add(itemIpad);
        Price pricePen = new Price(100, Currency.getInstance("INR"));
        Product productPen = new Product("Hero ink Pen", pricePen);
        Item itemPen = new Item(productPen, 1);
        cart.add(itemPen);
        Price priceBat = new Price(100, Currency.getInstance("INR"));
        Product productBat = new Product("GM Cricket bat", priceBat);
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
        Price price = new Price(100, Currency.getInstance(new Locale("en", "IN")));
        Product productIpad = new Product("Ipad pro", price);
        Item itemIpad = new Item(productIpad, 1);
        cart1.add(itemIpad);
        cart2.add(itemIpad);
        System.out.println(cart1.equals(cart2));
    }
}

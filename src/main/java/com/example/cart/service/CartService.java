package com.example.cart.service;

import com.example.cart.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartService {

    private final List<Item> cart = new ArrayList<>();

    public void addItem(String itemName) {
        try {
            cart.add(Item.valueOf(itemName.toUpperCase()));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid item: " + itemName);
        }
    }

    public List<Item> getCart() {
        return Collections.unmodifiableList(cart);
    }

    public int calculateTotal() {
        Map<Item, Long> counts = cart.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        int total = 0;

        for (Map.Entry<Item, Long> entry : counts.entrySet()) {
            Item item = entry.getKey();
            long qty = entry.getValue();

            switch (item) {
                case MELON:
                    total += (qty / 2 + qty % 2) * item.getPrice();
                    break;
                case LIME:
                    total += ((qty / 3) * 2 + (qty % 3)) * item.getPrice();
                    break;
                default:
                    total += qty * item.getPrice();
            }
        }
        return total;
    }
}

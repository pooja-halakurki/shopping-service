package com.example.cart.model;

public enum Item {
    APPLE(35),
    BANANA(20),
    MELON(50),   
    LIME(15);    

    private final int price; // in pence

    Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

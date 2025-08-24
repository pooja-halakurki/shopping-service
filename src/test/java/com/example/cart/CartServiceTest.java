package com.example.cart;

import com.example.cart.service.CartService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    void testAppleAndBanana() {
        CartService cart = new CartService();
        cart.addItem("Apple");
        cart.addItem("Banana");
        assertEquals(55, cart.calculateTotal());
    }

    @Test
    void testMelonOffer() {
        CartService cart = new CartService();
        cart.addItem("Melon");
        cart.addItem("Melon");
        assertEquals(50, cart.calculateTotal()); // BOGO
    }

    @Test
    void testLimeOffer() {
        CartService cart = new CartService();
        cart.addItem("Lime");
        cart.addItem("Lime");
        cart.addItem("Lime");
        assertEquals(30, cart.calculateTotal()); // 3 for 2
    }
}

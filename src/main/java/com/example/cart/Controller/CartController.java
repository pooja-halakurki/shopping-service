package com.example.cart.controller;

import com.example.cart.model.Item;
import com.example.cart.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add/{item}")
    public String addItem(@PathVariable String item) {
        cartService.addItem(item);
        return item + " added to cart.";
    }

    @GetMapping("/items")
    public List<Item> viewCart() {
        return cartService.getCart();
    }

    @GetMapping("/total")
    public String getTotal() {
        return "Total: " + cartService.calculateTotal() + "p";
    }
}

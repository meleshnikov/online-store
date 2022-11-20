package com.skypro.store.controller;

import com.skypro.store.model.Cart;
import com.skypro.store.model.Product;
import com.skypro.store.record.ProductRequest;
import com.skypro.store.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("cart/product/add")
    @ResponseBody
    public Product createProduct(@RequestParam String name) {
        return this.cartService.addProduct(new ProductRequest(name));
    }

    @GetMapping("cart/get")
    public Cart getCart() {
        return this.cartService.getCart();
    }

}

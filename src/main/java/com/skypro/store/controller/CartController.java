package com.skypro.store.controller;

import com.skypro.store.model.Cart;
import com.skypro.store.model.Product;
import com.skypro.store.record.ProductRequest;
import com.skypro.store.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("cart/product/add")
    public Product createProduct(@RequestBody ProductRequest productRequest) {
        return this.cartService.addProduct(productRequest);
    }

    @GetMapping("cart/get")
    public Cart getCart() {
        return this.cartService.getCart();
    }
    
}

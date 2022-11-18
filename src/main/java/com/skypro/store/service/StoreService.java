package com.skypro.store.service;

import com.skypro.store.model.Cart;
import com.skypro.store.model.Product;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    private final CartService cartService;

    private final Cart cart = new Cart();

    public StoreService(CartService cartService) {
        this.cartService = cartService;
    }

    public Cart add(int... ids) {
        for (int id : ids) {
            Product product = cartService.getProductById(id);
            if (product != null) {
                cart.getCart().putIfAbsent(id, product);
            }
        }
        return cart;
    }

    public Cart get() {
        return this.cart;
    }

}

package com.skypro.store.service;

import com.skypro.store.model.Cart;
import com.skypro.store.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class StoreService {

    private final CartService cartService;

    private final Cart cart;

    public StoreService(CartService cartService, Cart cart) {
        this.cartService = cartService;
        this.cart = cart;
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

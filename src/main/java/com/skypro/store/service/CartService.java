package com.skypro.store.service;

import com.skypro.store.model.Cart;
import com.skypro.store.model.Product;
import com.skypro.store.record.ProductRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@SessionScope
public class CartService {

    private final Cart cart;


    @PostConstruct
    public void resetProductIdCounter() {
        ProductRequest.setIdCounter(0);
    }

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public Product addProduct(ProductRequest productRequest) {
        Product product = new Product(productRequest.getId(), productRequest.getName());
        cart.getCart().put(product.getId(), product);
        return product;
    }

    public Cart getCart() {
        return this.cart;
    }

    public Product getProductById(int id) {
        return this.cart.getCart().get(id);
    }

}

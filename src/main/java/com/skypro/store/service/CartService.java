package com.skypro.store.service;

import com.skypro.store.model.Cart;
import com.skypro.store.model.Product;
import com.skypro.store.record.ProductRequest;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class CartService {

    private final Cart cart;

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

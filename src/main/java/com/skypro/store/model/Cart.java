package com.skypro.store.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Scope("prototype")
public class Cart {

    private final Map<Integer, Product> cart = new HashMap<>();

    public Map<Integer, Product> getCart() {
        return cart;
    }
}

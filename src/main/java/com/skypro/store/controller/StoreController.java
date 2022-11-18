package com.skypro.store.controller;

import com.skypro.store.model.Cart;
import com.skypro.store.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/store/order/add")
    public Cart add(int... ids) {
        return storeService.add(ids);
    }

    @GetMapping("/store/order/get")
    public Cart get() {
        return storeService.get();
    }

}

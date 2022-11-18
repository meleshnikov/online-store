package com.skypro.store.controller;

import com.skypro.store.model.Cart;
import com.skypro.store.service.StoreService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/store/order/add")
    @ResponseBody
    public Cart add(@RequestParam int... ids) {
        return storeService.add(ids);
    }

    @GetMapping("/store/order/get")
    public Cart get() {
        return storeService.get();
    }

}

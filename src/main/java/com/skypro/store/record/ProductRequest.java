package com.skypro.store.record;

public class ProductRequest {

    private static int idCounter;
    private final int id = ++idCounter;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

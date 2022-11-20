package com.skypro.store.record;

public class ProductRequest {

    private static int idCounter;
    private final int id = idCounter++;
    private String name;

    public ProductRequest(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void setIdCounter(int idCounter) {
        ProductRequest.idCounter = idCounter;
    }
}

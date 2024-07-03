package com.example.projectwithjava;

public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;

    private static int idCounter = 0;

    public Product(String name, String description, int quantity) {
        this.id = ++idCounter;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}

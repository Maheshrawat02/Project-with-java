package com.example.projectwithjava;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static final List<Product> products = new ArrayList<>();

    public static List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public static void addProduct(Product product) {
        products.add(product);
    }
}


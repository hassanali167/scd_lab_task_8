package com.example.designpatterns.factory;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics();
            case "clothing":
                return new Clothing();
            case "books":
                return new Books();
            default:
                throw new IllegalArgumentException("Invalid product type.");
        }
    }
}

package com.example.designpatterns.prototype;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductEntity implements Cloneable {
    
    @Id
    private String id;
    private String name;
    private String category;
    private double price;
    private String color;

    public ProductEntity() {}

    public ProductEntity(String name, String category, double price, String color) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
    }

    @Override
    public ProductEntity clone() {
        return new ProductEntity(this.name, this.category, this.price, "Cloned-Color");
    }

    // Getters and Setters
}

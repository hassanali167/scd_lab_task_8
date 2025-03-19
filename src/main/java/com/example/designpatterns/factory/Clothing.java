package com.example.designpatterns.factory;

public class Clothing implements Product {
    @Override
    public void showDetails() {
        System.out.println("This is a Clothing Product.");
    }
}

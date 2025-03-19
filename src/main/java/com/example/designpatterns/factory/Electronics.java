package com.example.designpatterns.factory;

public class Electronics implements Product {
    @Override
    public void showDetails() {
        System.out.println("This is an Electronic Product.");
    }
}

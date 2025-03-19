package com.example.designpatterns.factory;

public class Books implements Product {
    @Override
    public void showDetails() {
        System.out.println("This is a Book Product.");
    }
}

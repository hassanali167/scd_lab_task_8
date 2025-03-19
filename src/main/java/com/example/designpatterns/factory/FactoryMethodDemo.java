package com.example.designpatterns.factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Product electronics = ProductFactory.createProduct("electronics");
        electronics.showDetails();

        Product clothing = ProductFactory.createProduct("clothing");
        clothing.showDetails();

        Product books = ProductFactory.createProduct("books");
        books.showDetails();
    }
}

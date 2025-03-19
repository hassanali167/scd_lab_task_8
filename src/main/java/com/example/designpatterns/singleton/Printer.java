package com.example.designpatterns.singleton;

public class Printer {

    private static Printer instance;

    private Printer() {}

    public static synchronized Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void printMessage(String message) {
        System.out.println("Printer Message: " + message);
    }
}

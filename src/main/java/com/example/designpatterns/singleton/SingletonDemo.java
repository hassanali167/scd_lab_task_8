package com.example.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        printer1.printMessage("Hello, Singleton!");
        
        // Verifying both instances are the same
        System.out.println(printer1 == printer2);  // Should print true
    }
}

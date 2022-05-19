package com.etrack;

public class Product {
    private int id;
    private String name;
    private double price;

    // constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString()
    public String toString() {
        return getName() + " Price: " + getPrice();
    }
}

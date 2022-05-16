package com.etrack;

public class Product {
    private final int productId;
    private final String name;
    private final double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Products: " + getProductId() + " " + getName() + " " + getPrice();
    }
}

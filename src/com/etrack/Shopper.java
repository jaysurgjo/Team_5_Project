package com.etrack;

import com.etrack.controller.EtrackController;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Shopper {

    private String CustomerName;
    private int customerId;
    private double rewards;
    private final Collection<Product> cart = new ArrayList<>();


    public void addProductToCart(int id) {
        // if user input matches item in showProductList()
        // add productName and Price into the cart collection
        if (id == ) {  //  == if from catalog
            cart.add(products.get(id));
        }

    }

    public void removeProductFromCart(int id) {
        // if selections and id to remove product
        // find that id and remove from cart collection
        if (products.containsKey(id)) {
            cart.remove(products.get(id));  // remove product
        }
    }


    public double totalCostOfAllProducts() {
        double total = 0.0;
        // for each item in cart. get multiple get me the price


        return total;
    }

    public double rewards() {
        double results = 0.0;

        return results;
    }

    private void shop() {
        boolean stillShopping = true;

        while (stillShopping) {
            showProductList();
            int id = promptForProductId();
            addProductToCart(id);
            stillShopping = promptToContinueShopping();

        }
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public double getRewards() {
        return rewards;
    }

    /*
    // readlines from product-data
    private Map<Integer, Product> loadProducts() {
        Map<Integer, Product> products = new HashMap<>();

        try {

            List<String> lines = Files.readAllLines(Path.of("data/product-data.csv"));

            for (String line : lines) {
                String[] tokens = line.split(",");
                Integer id = Integer.parseInt(tokens[0]);
                Product name = products.get(tokens[1]);  // get the second item from the token array
                Double price = Double.valueOf(tokens[2]);
                products.put(id, name);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;

    }
     */

    @Override
    public String toString() {
        return "CustomerName: " + getCustomerName() + "customerId: " + "reward points=" + getRewards();
    }
}

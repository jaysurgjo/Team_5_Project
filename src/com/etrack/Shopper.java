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
    private double getRewards;
    private final Collection<Product> cart = new ArrayList<>();

    /*
     * If id inserted by customer matches he id in product
     * add the product associated with the id
     * And add to cart collection above
     */
    public void addProductToCart(int id) {
        /*
        if (id == ) {  //  == if from catalog
            cart.add(products.get(id));
        }

         */

    }

    /*
     * If id inserted by customer matches he id in product
     * remove the product associated with the id
     * And add to cart collection above
     */
    public void removeProductFromCart(int id) {
        /*
        if (products.containsKey(id)) {
            cart.remove(products.get(id));  // remove product
        }

         */
    }


    /*
     * Get the price of each item and add it.
     * This can be done by matching a price with an id or price with product
     */
    public double totalCostOfAllProducts() {
        double total = 0.0;

        return total;
    }


    /*
     * established that for a reward, when we spend every $5 we get $1 reward
     * Which means total above divided by 5
     */
    public double getRewards() {
        double results = 0.0;

        return results;
    }

    /*
     * Contuue running steps above unless customer decides to checkout
     */
    private void shop() {
        boolean stillShopping = true;

        while (stillShopping) {
            /*
            showProductList();
            int id = promptForProductId();
            addProductToCart(id);
            stillShopping = promptToContinueShopping();

             */

        }
    }

    public String getCustomerName() {
        return CustomerName;

    }


    @Override
    public String toString() {
        return "CustomerName: " + getCustomerName() + "customerId: " + "reward points=" + getRewards();
    }
}

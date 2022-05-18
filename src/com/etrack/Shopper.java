package com.etrack;

import java.util.*;

public class Shopper {

    private String customerName;
    private double rewards;
    private static final double REWARDS_FACTOR = 5.0;
    private final Collection<Product> cart = new ArrayList<>();

    /*
     * If id inserted by customer matches he id in product
     * add the product associated with the id
     * And add to cart collection above
     */

    public Shopper(String customerName) {
        this.customerName = customerName;
    }

    public void addProductToCart(Product product) {
        cart.add(product);
    }



    /*
     * If id inserted by customer matches he id in product
     * remove the product associated with the id
     * And add to cart collection above
     */
    private void removeProductFromCart(Product product) {
        cart.remove(product);
    }


    /*
     * Get the price of each item and add it.
     * This can be done by matching a price with an id or price with product
     */
    public double totalCostOfAllProducts() {
        double total = 0.0;
        for (Product product : cart){
            total += product.getPrice();
        }
        return Math.round(total);
    }

    // getCart - returns a copy of collection - List.copyof(cart)
    public List<Product> getCart() {

        return List.copyOf(cart);
    }

    /*
     * established that for a reward, when we spend every $5 we get $1 reward
     * Which means total above divided by 5
     */

    /*
     * Contuue running steps above unless customer decides to checkout
     */

    public String getCustomerName() {
        return customerName;
    }

    public double getRewards() {

        return Math.round(totalCostOfAllProducts()/REWARDS_FACTOR); // to do static divider;
    }

    @Override
    public String toString() {
        return "CustomerName: " + getCustomerName() + " totalCost: " + totalCostOfAllProducts() + "reward points=" + getRewards();
    }
}

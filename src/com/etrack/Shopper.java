package com.etrack;

import java.util.*;

public class Shopper {

    private final String customerName;
    private double rewards;
    private static final double REWARDS_FACTOR = 5.0;
    private static final double TAXES = 0.07; // General taxation rate.
    private final Collection<Product> cart = new ArrayList<>();

    /*
     * If id inserted by customer matches the id in product
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
     * If id inserted by customer matches the id in product
     * remove the product associated with the id
     * And add to cart collection above
     */
    private void removeProductFromCart(Product product) {
        cart.remove(product);
    }

    public double totalCostOfAllProductsAndTaxes() {
        double totalCost = (subTotal() + getTotalTax()); // creating variable to store and add subtotal of items.
        return Math.round(totalCost);  //returned the variable
    }

    // Calculating the tax for the cart.
    public double getTotalTax() {
        return Math.round(subTotal() * TAXES);
    }

    public double subTotal() {
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
     * Continue running steps above unless customer decides to check out
     */

    public String getCustomerName() {
        return customerName;
    }

    public double getRewards() {
        return Math.round(totalCostOfAllProductsAndTaxes()/REWARDS_FACTOR); // to do static divider;
    }

    @Override
    public String toString() {
        return "CustomerName: " + getCustomerName() + " totalCost: " + totalCostOfAllProductsAndTaxes() + "reward points: " + getRewards();
    }
}

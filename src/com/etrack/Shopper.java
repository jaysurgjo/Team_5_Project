package com.etrack;

import java.util.*;

public class Shopper {

    private String customerName;
    private double rewards;
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
    public void removeProductFromCart(Product product) {
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
        return total;
    }

    // getCart - returns a copy of collection - List.copyof(cart)


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

        return totalCostOfAllProducts()/5.0; // to do static divider;
    }

    @Override
    public String toString() {
        return "CustomerName: " + getCustomerName() + "customerId: " + "reward points=" + getRewards();
    }
}

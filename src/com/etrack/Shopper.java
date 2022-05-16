package com.etrack;

import java.util.ArrayList;
import java.util.Collections;

public class Shopper {

    private String CustomerName;
    private int customerId;
    private final int rewardPoints;
    //Collections<Product> cart = new ArrayList<>();

    public Shopper(String customerName, int customerId, int rewardPoints) {
        CustomerName = customerName;
        this.customerId = customerId;
        this.rewardPoints = rewardPoints;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getRewardPoints() {
        return rewardPoints;
    }

    private void add() {

    }

    private void remove() {

    }
    private void getCartTotal() {
        //return double;
    }

    @Override
    public String toString() {
        return "CustomerName: " + getCustomerName() + "customerId: " + getCustomerId() + "reward points=" + getRewardPoints();
    }
}

package com.etrack.controller;

import com.etrack.Product;
import com.etrack.ProductLoader;
import com.etrack.Shopper;
import com.rtrack.view.ProductView;

import java.util.*;

public class EtrackController {
    private Scanner scanner = new Scanner(System.in);    // String - nextLine  Integer- nextInt
    private Map<Integer, Product> productMap = ProductLoader.loadProducts();
    private Shopper shopper = null;
    private boolean stillShopping = true;


    //created model class
    public void execute() {
        welcome();
        String customerName = promptForCustomerName();
        shopper = new Shopper(customerName);
        while (stillShopping) {
            showProductList();
            int productId = promptForProductId();
            Product p = productMap.get(productId);
            addToCart(p);
            stillShopping = promptToContinueShopping();
        }
        // all methods private
        checkOut();
    }

    private void welcome() {
        System.out.println("\n");
        System.out.println("W E L C O M E  T O  R-T R A C K");
        System.out.println("\n");
    }

    // prompt for name
    public String promptForCustomerName() {
        String userName = null;
        boolean validName = false;
        while (!validName) {
            System.out.print("Please enter name: ");
            String customerName = scanner.nextLine().trim();
            if (customerName.length() > 1) {
                userName = customerName;
                validName = true;
            }
        }
        return userName;
    }

    // show products available
    public void showProductList() {
        ProductView view = new ProductView(productMap);
        view.render();
    }

    // prompt for productID
    public int promptForProductId() {
        int productId = 0;
        boolean validId = false;
        while (!validId) {
            System.out.print("Please enter an id: ");
            String inputId = scanner.nextLine().trim();
            if (inputId.matches("\\d{1,2}")) {   // we support only 99 products
                productId = Integer.parseInt(inputId);
                if (productId >= 1 && productId <= productMap.size()) {
                    validId = true;
                }
            }
        }
        return productId;
    }


    // add product to cart by calling shopper method
    private void addToCart(Product product) {
        shopper.addProductToCart(product);
    }


    // ask if they want to checkout or continue
    public boolean promptToContinueShopping() {
        boolean result = false;

        boolean valid = false;
        while (!valid) {
            System.out.println("Do you want to checkout or continue. Type Y to continue and N to checkout");
            String input = scanner.nextLine().toUpperCase().trim();
            if (input.matches("Y|N")) {
                //valid = "Y".equals(input);
                valid = true;
                result = "Y".equals(input);
            }
        }

        return result;
    }


    // display cart
    public void displayCart() {
        shopper.getCart();
    }

    public void checkOut() {
        // call displaycart
        // calls total
        // gets rewards
    }


}

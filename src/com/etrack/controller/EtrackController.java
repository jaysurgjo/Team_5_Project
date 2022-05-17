package com.etrack.controller;

import com.etrack.Shopper;
import com.etrack.Product;
import com.etrack.view.EtrackView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EtrackController {
    private Scanner scanner = new Scanner(System.in);    // String - nextLine  Integer- nextInt
    private int productId;

    //created model class

    public void execute(){
        welcome();
        promptForCustomerName();
        showProductList();
        promptForProductId();
        addToCart();
        promptToContinueShopping();
        displayCart();
        checkOut();
     }

    private void welcome() {
        System.out.println("\n");
        System.out.println("E-TRACK");
        System.out.println("\n");
    }

     // prompt for name
     public String promptForCustomerName() {

         String userName = null;

         boolean validName = false;
         while(!validName) {
             System.out.println("Please enter name: ");
             String customerName = scanner.nextLine();
             if (customerName.length() > 1 && (!customerName.matches("\\d{1,2}"))) {
                 userName = customerName;
             }
         }
         return  userName;
     }

    // show products available
    public List<Product> showProductList() {
        List<Product> productList = new ArrayList<>();
        // for each prodct from Product and add it in productList
        productList.add();
    }

    // prompt for priductID
    public int promptForProductId() {
        int productId = 0;
        boolean validId = false;
        while (!validId) {
            System.out.println("Please enter an id: ");
            String inputId = scanner.nextLine();
            int inputIdInteger = Integer.parseInt(inputId);
            if (productId < 0 || productId > 20 ) {
                productId = inputIdInteger;
            }
        }
        return productId;
    }

    // add product to cart by calling shopper method
    public void addToCart() {
        // call shopper add method and parse in productId
        // get the product assciated with the id
        //addProductToCart(productId);
    }

    // ask if they want to checkout or continue
    public void promptToContinueShopping() {
        System.out.println("Do you want to checkout or continue. Type Y to continue and N to checkout");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals("Y")){
            promptForProductId();
        }
        else {
            // checkout
        }
    }


    // displau cart
    public void displayCart() {

    }

    public void checkOut() {
        //
    }

}

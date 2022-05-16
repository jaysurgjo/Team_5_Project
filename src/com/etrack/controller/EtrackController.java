package com.etrack.controller;

import java.util.Scanner;

class EtrackController {

    private Scanner scanner = new Scanner(System.in);    // String - nextLine  Integer- nextInt


    //created model class

    public void execute(){
        welcome();
        displayCart();
     }
 

    // show products available


    // Select product
    public void selectProduct() {

    }


    // Update cart
    public void updateCart() {

    }

    public void displayCart() {

    }

    //
    public String promptForName() {

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


    private void welcome() {
        System.out.println("\n");
        System.out.println("E-TRACK");
        System.out.println("\n");
    }
}

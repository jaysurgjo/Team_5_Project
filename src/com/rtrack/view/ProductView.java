package com.rtrack.view;

import com.etrack.Product;

import java.util.Map;

public class ProductView {
    private final Map<Integer, Product> productList;

    public ProductView( Map<Integer,Product> productList) {
        this.productList = productList;
    }

    public void render() {
        if (productList.isEmpty()){
            System.out.println("There is not product to show");
        }
        else {
            for(Map.Entry<Integer, Product> entry : productList.entrySet()){
                System.out.println("id :" +  entry.getKey() + " product: " + entry.getValue());
            }
        }
    }

}


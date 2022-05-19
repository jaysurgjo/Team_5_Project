package com.rtrack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductLoader {
    // readlines from product-data
    public static Map<Integer, Product> loadProducts() {
        Map<Integer, Product> products = new TreeMap<>();

        try {
            List<String> lines = Files.readAllLines(Path.of("data/product-data.csv"));

            for (String line : lines) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];  // get the second item from the token array
                double price = Double.parseDouble(tokens[2]);
                products.put(id, new Product(id, name, price));


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

}

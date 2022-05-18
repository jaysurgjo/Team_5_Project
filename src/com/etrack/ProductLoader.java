package com.etrack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductLoader {
    // readlines from product-data
    private Map<Integer, Product> loadProducts() {
        Map<Integer, Product> products = new HashMap<>();

        try {

            List<String> lines = Files.readAllLines(Path.of("data/product-data.csv"));

            for (String line : lines) {
                String[] tokens = line.split(",");
                Integer id = Integer.parseInt(tokens[0]);
                Product name = products.get(tokens[1]);  // get the second item from the token array
                Double price = Double.valueOf(tokens[2]);
                products.put(id, name);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

}

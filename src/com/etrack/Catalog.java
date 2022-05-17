package com.etrack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
    //private Map<Integer, Product> loadProducts;
    private Map<Integer, String> loadProducts() {
        Map<Integer, String> products = new HashMap<>();

        try {

            List<String> lines = Files.readAllLines(Path.of("data/product-data.csv"));

            for (String line : lines) {
                String[] tokens = line.split(",");
                Integer id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                Double price = Double.parseDouble(tokens[2]);
                products.put(id, name);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }


}


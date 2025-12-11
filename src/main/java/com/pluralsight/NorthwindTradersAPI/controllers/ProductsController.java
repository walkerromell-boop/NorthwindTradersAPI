package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    @RequestMapping(path = "products")
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Wireless Mouse", 2, 25));
        products.add(new Product(2, "USB-C Charger", 3, 19));
        products.add(new Product(3, "Notebook Paper", 1, 5));
        products.add(new Product(4, "Gaming Keyboard", 2, 49));
        products.add(new Product(5, "LED Desk Lamp", 4, 29));
        products.add(new Product(6, "Bluetooth Speaker", 3, 39));
        products.add(new Product(7, "Phone Stand", 1, 10));
        products.add(new Product(8, "Water Bottle", 5, 12));
        products.add(new Product(9, "Backpack", 5, 45));
        products.add(new Product(10, "HDMI Cable", 3, 8));
        return products;
    }
}

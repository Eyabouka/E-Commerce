package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Product;

import java.util.List;

public interface ClientService {
    void addProduct(Product p );
    List<Product> getAllProducts();
}
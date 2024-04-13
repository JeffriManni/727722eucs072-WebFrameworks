package com.example.three.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.three.model.Product;
import com.example.three.repository.ProductRepository;

import java.util.*;


@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepo;

    public Product saveProduct(Product product)
    {
        return productRepo.save(product);
    }

    public List<Product> getList()
    {
        return productRepo.findAll();
    }

    public Product getProductid(int productId)
    {
        return productRepo.findById(productId).orElse(null);
    }
}
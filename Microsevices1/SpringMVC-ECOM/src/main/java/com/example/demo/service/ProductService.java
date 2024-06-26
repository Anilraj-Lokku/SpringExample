package com.example.demo.service;


import com.example.demo.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Product> getAllProducts() {
        String url = "http://example.com/api/products"; 
        Product[] products = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(products);
    }
}
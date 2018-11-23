package com.testopa.testopa.services;

import com.testopa.testopa.domain.Product;
import com.testopa.testopa.repository.ProductRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Product findByName(String name) {
        var products = productRepository.findByProductName(name);
        return products.isEmpty() ? null : products.get(0);
    }

    public Product findById(Long id) {
        var products = productRepository.findById(id);
        return products.orElse(null);
    }

}

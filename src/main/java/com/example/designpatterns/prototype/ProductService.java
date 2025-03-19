package com.example.designpatterns.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductEntity cloneProduct(String id, String newColor) {
        ProductEntity existingProduct = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        ProductEntity clonedProduct = existingProduct.clone();
        clonedProduct.setColor(newColor);
        
        return repository.save(clonedProduct);
    }
}

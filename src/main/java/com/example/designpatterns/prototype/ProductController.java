package com.example.designpatterns.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/clone/{id}")
    public ProductEntity cloneProduct(@PathVariable String id, @RequestParam String color) {
        return service.cloneProduct(id, color);
    }
}

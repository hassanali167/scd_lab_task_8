package com.example.designpatterns.prototype;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}

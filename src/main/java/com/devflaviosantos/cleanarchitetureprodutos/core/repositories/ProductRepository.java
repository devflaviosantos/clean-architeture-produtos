package com.devflaviosantos.cleanarchitetureprodutos.core.repositories;

import com.devflaviosantos.cleanarchitetureprodutos.core.entities.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {
    void save(Product produto);
    Optional<Product> findById(UUID id);
    List<Product> findAll();
    void deleteById(UUID id);
    boolean existsById(UUID id);
}

package com.devflaviosantos.cleanarchitetureprodutos.core.usecases;

import com.devflaviosantos.cleanarchitetureprodutos.core.entities.Product;
import com.devflaviosantos.cleanarchitetureprodutos.core.repositories.ProductRepository;

import java.util.Optional;
import java.util.UUID;

public class GetForIdProductUseCase {

    private final ProductRepository productRepository;


    public GetForIdProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> execute(UUID id) {
        // Validate ID
        if (id == null || id.toString().isEmpty()) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        // Fetch product by ID
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new IllegalArgumentException("Product not found");
        }

        return product;
    }
}

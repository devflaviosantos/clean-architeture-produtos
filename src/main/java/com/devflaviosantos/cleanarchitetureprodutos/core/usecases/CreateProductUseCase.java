package com.devflaviosantos.cleanarchitetureprodutos.core.usecases;

import com.devflaviosantos.cleanarchitetureprodutos.core.entities.Product;
import com.devflaviosantos.cleanarchitetureprodutos.core.repositories.ProductRepository;

import java.math.BigDecimal;

public class CreateProductUseCase {
    private final ProductRepository productRepository;

    public CreateProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void execute(Product product) {
        // Validate product
        if (product == null || product.getName() == null || product.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid product");
        }

        productRepository.save(product);
    }
}

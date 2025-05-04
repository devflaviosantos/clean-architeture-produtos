package com.devflaviosantos.cleanarchitetureprodutos.application.controller;

import com.devflaviosantos.cleanarchitetureprodutos.core.entities.Product;
import com.devflaviosantos.cleanarchitetureprodutos.core.usecases.CreateProductUseCase;
import com.devflaviosantos.cleanarchitetureprodutos.core.usecases.GetForIdProductUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final CreateProductUseCase createProductUseCase;
    private final GetForIdProductUseCase getForIdProductUseCase;


    public ProductController(CreateProductUseCase createProductUseCase, GetForIdProductUseCase getForIdProductUseCase) {
        this.createProductUseCase = createProductUseCase;
        this.getForIdProductUseCase = getForIdProductUseCase;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        try {
            createProductUseCase.execute(product);
            return ResponseEntity.ok(product);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable UUID id) {
        try {
            Product product = getForIdProductUseCase.execute(id).orElseThrow(() -> new IllegalArgumentException("Product not found"));
            return ResponseEntity.ok(product);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }



}

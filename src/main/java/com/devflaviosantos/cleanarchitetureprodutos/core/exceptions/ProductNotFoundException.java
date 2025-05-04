package com.devflaviosantos.cleanarchitetureprodutos.core.exceptions;

import java.util.UUID;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(UUID id) {
        super("Produto não encontrado com o id: " + id);
    }
}

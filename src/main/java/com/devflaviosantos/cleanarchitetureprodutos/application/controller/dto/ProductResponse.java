package com.devflaviosantos.cleanarchitetureprodutos.application.controller.dto;

import java.math.BigDecimal;
import java.util.UUID;

import static jakarta.persistence.GenerationType.UUID;

public record ProductResponse(UUID id,
                              String name,
                              String description,
                              BigDecimal price,
                              String imageUrl) {

    public static ProductResponse from(UUID id, String name, String description, BigDecimal price, String imageUrl) {
        return new ProductResponse(id, name, description, price, imageUrl);
    }
}

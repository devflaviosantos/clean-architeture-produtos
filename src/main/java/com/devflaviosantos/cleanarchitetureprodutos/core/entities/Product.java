package com.devflaviosantos.cleanarchitetureprodutos.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantityEstock;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;


    public Product(UUID id, String name, String description, BigDecimal price, int quantityEstock) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityEstock = quantityEstock;
        this.creationDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
    }
}

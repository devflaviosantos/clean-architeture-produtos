package com.devflaviosantos.cleanarchitetureprodutos.infra.persistence.mapper;

import com.devflaviosantos.cleanarchitetureprodutos.core.entities.Product;
import com.devflaviosantos.cleanarchitetureprodutos.infra.entities.ProductEntity;

public class ProductMapper {
    public static Product toDomain(ProductEntity productEntity) {
        return new Product(productEntity.getId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getQuantityEstock());

    }

    public static ProductEntity toEntity(Product domain) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(domain.getId());
        productEntity.setName(domain.getName());
        productEntity.setDescription(domain.getDescription());
        productEntity.setPrice(domain.getPrice());
        return productEntity;
    }
}

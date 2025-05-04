package com.devflaviosantos.cleanarchitetureprodutos.infra.persistence;

import com.devflaviosantos.cleanarchitetureprodutos.infra.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataProductRepository extends JpaRepository<ProductEntity, UUID> {
}

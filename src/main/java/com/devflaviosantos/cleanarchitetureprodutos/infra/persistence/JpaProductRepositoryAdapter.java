package com.devflaviosantos.cleanarchitetureprodutos.infra.persistence;

import com.devflaviosantos.cleanarchitetureprodutos.core.entities.Product;
import com.devflaviosantos.cleanarchitetureprodutos.core.repositories.ProductRepository;
import com.devflaviosantos.cleanarchitetureprodutos.infra.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class JpaProductRepositoryAdapter implements ProductRepository {

    private final SpringDataProductRepository springDataProductRepository;

    public JpaProductRepositoryAdapter(SpringDataProductRepository springDataProductRepository) {
        this.springDataProductRepository = springDataProductRepository;
    }

    @Override
    public void save(Product produto) {
        var entity = ProductMapper.toEntity(produto);
        entity = springDataProductRepository.save(entity);

    }

    @Override
    public Optional<Product> findById(UUID id) {
        return springDataProductRepository.findById(id)
                .map(ProductMapper::toDomain);
    }

    @Override
    public List<Product> findAll() {
        return springDataProductRepository.findAll()
                .stream()
                .map(ProductMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {
        springDataProductRepository.deleteById(id);
    }

    @Override
    public boolean existsById(UUID id) {
        return springDataProductRepository.existsById(id);
    }
}

package com.devflaviosantos.cleanarchitetureprodutos.infra.config;

import com.devflaviosantos.cleanarchitetureprodutos.core.repositories.ProductRepository;
import com.devflaviosantos.cleanarchitetureprodutos.core.usecases.CreateProductUseCase;
import com.devflaviosantos.cleanarchitetureprodutos.core.usecases.GetForIdProductUseCase;
import com.devflaviosantos.cleanarchitetureprodutos.infra.persistence.JpaProductRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ProductRepository productRepository(JpaProductRepositoryAdapter adapter){
        return adapter;
    }

    @Bean
    public CreateProductUseCase createProductUseCase(ProductRepository productRepository) {
        return new CreateProductUseCase(productRepository);
    }

    @Bean
    public GetForIdProductUseCase getForIdProductUseCase(ProductRepository productRepository) {
        return new GetForIdProductUseCase(productRepository);
    }

}

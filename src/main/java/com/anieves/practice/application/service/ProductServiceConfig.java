package com.anieves.practice.application.service;

import com.anieves.practice.domain.gateway.ProductGateway;
import com.anieves.practice.domain.gateway.UserGateway;
import com.anieves.practice.domain.usecase.ProductUseCase;
import com.anieves.practice.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductServiceConfig {
    @Bean
    public ProductUseCase productservice(ProductGateway productGateway){
        return new ProductUseCase(productGateway);
    }
}

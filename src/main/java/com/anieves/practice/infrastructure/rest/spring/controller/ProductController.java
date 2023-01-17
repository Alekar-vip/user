package com.anieves.practice.infrastructure.rest.spring.controller;

import com.anieves.practice.domain.model.ProductDto;
import com.anieves.practice.domain.usecase.ProductUseCase;
import com.anieves.practice.infrastructure.config.Exceptions.ControllerException;
import com.anieves.practice.infrastructure.config.Exceptions.UseCaseExceptions;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/producto-api")
public class ProductController {
    private final ProductUseCase productUseCase;


    @PostMapping("/crear")
    public void createProduct(@RequestBody ProductDto productDto) throws ControllerException {
            try{
                productUseCase.saveProduct(productDto);
            }catch (UseCaseExceptions useCaseExceptions){
                throw new ControllerException(useCaseExceptions);
            }
    }
}

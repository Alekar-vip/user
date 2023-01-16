package com.anieves.practice.domain.usecase;

import com.anieves.practice.domain.gateway.ProductGateway;
import com.anieves.practice.domain.model.ProductDto;
import com.anieves.practice.infrastructure.config.Exceptions.DaoExceptions;
import com.anieves.practice.infrastructure.config.Exceptions.UseCaseExceptions;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ProductUseCase {
    private final ProductGateway productGateway;

    public void saveProduct(ProductDto productDto) throws UseCaseExceptions{
        try{
            ProductDto productfound = productGateway.getbyid(productDto);
            if(productfound != null){
                productGateway.update(productDto);
            }else {
                productGateway.insert(productDto);
            }
        }catch (DaoExceptions e){
           throw new UseCaseExceptions(e);
        }
    }
}

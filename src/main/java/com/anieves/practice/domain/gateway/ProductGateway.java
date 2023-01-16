package com.anieves.practice.domain.gateway;

import com.anieves.practice.domain.model.ProductDto;
import com.anieves.practice.infrastructure.config.Exceptions.DaoExceptions;

import java.util.List;

public interface ProductGateway {
    public void insert(ProductDto producto) throws DaoExceptions;
    public void delete(ProductDto producto)  throws DaoExceptions;
    public void update(ProductDto producto) throws DaoExceptions;
    public ProductDto getbyid(ProductDto producto) throws DaoExceptions;
    public List getbyname(ProductDto producto) throws DaoExceptions;
    public List getAll() throws DaoExceptions;
}

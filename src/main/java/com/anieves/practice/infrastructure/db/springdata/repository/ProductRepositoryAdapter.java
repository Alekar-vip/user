package com.anieves.practice.infrastructure.db.springdata.repository;

import com.anieves.practice.domain.gateway.ProductGateway;
import com.anieves.practice.domain.model.ProductDto;
import com.anieves.practice.infrastructure.config.Exceptions.DaoExceptions;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryAdapter implements ProductGateway{

    private JdbcTemplate jdbctemplate;

    @Override
    public void insert(ProductDto producto) throws DaoExceptions {

    }

    @Override
    public void delete(ProductDto producto) throws DaoExceptions {

    }

    @Override
    public void update(ProductDto producto) throws DaoExceptions {

    }

    @Override
    public ProductDto getbyid(ProductDto producto) throws DaoExceptions {
        return null;
    }

    @Override
    public List getbyname(ProductDto producto) throws DaoExceptions {
        return null;
    }

    @Override
    public List getAll() throws DaoExceptions {
        return null;
    }
}

package com.anieves.practice.infrastructure.db.springdata.repository;

import com.anieves.practice.domain.gateway.ProductGateway;
import com.anieves.practice.domain.model.ProductDto;
import com.anieves.practice.infrastructure.config.Exceptions.DaoExceptions;
import com.anieves.practice.infrastructure.db.springdata.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryAdapter implements ProductGateway{

    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbctemplate;

    @Override
    public void insert(ProductDto producto) throws DaoExceptions {
        String insertdata = "INSERT INTO public.producto\n" +
                "(id, p_name)\n" +
                "VALUES(?, ?);\n";
        try{
            jdbctemplate = new JdbcTemplate(dataSource);
            jdbctemplate.update(insertdata, producto.getId(), producto.getP_name());
        }catch (Exception e){
            throw new DaoExceptions(e);
        }
    }

    @Override
    public void delete(ProductDto producto) throws DaoExceptions {

    }

    @Override
    public void update(ProductDto producto) throws DaoExceptions {
        String insertar = "UPDATE public.producto\n" +
                "SET p_name=? WHERE id = ?;\n";
        try{
            jdbctemplate = new JdbcTemplate(dataSource);
            jdbctemplate.update(insertar, producto.getP_name(), producto.getId());
        }catch (Exception ex)
        {
            throw new DaoExceptions(ex);
        }
    }

    @Override
    public ProductDto getbyid(ProductDto producto) throws DaoExceptions {
        String SELECT = "select id, p_name from public.producto where id=?";
        try{
            jdbctemplate = new JdbcTemplate(dataSource);
            return jdbctemplate.queryForObject(SELECT, new ProductMapper(), producto.getId());
        }catch (EmptyResultDataAccessException ex)
        {
            return null;
        }
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

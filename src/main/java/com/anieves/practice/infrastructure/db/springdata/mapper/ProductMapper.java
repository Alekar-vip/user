package com.anieves.practice.infrastructure.db.springdata.mapper;

import com.anieves.practice.domain.model.ProductDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<ProductDto> {

    @Override
    public ProductDto mapRow(ResultSet rs, int rownum) throws SQLException{
        ProductDto productomapper = new ProductDto();
        productomapper.setId(rs.getString("id"));
        productomapper.setP_name(rs.getString("p_name"));
        return productomapper;
    }
}

package com.anieves.practice.infrastructure.db.springdata.repository;

import com.anieves.practice.domain.gateway.UserGateway;
import com.anieves.practice.domain.model.User;
import com.anieves.practice.infrastructure.db.springdata.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepositoryAdapter implements UserGateway {

    @Autowired
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Override
    public User save(User user) {
        String sqlSaveUser = "INSERT INTO public.user \n" +
                "(id, name, address) \n " +
                " VALUES (?, ?, ?); ";
        try {
            jdbcTemplate = new JdbcTemplate(dataSource);
            jdbcTemplate.update(sqlSaveUser, user.getId(), user.getName(), user.getAddress());
        } catch (DataAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> searchUser() {
        String getAllUsers = "select id, name, address from public.user; ";
        try {
            jdbcTemplate = new JdbcTemplate(dataSource);
            return jdbcTemplate.query(getAllUsers, new UserMapper());
        } catch (DataAccessException ex) {
            ex.printStackTrace();
            throw new RuntimeException("error al consultar");
        }
    }

    @Override
    @Transactional
    public void deleteUser(String id) {
        String deleteUser = "DELETE FROM public.user WHERE id = ? ;";
        try {
            jdbcTemplate = new JdbcTemplate(dataSource);
            jdbcTemplate.update(deleteUser, id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}

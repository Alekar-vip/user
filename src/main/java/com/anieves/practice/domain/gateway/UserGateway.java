package com.anieves.practice.domain.gateway;

import com.anieves.practice.domain.model.User;

import java.util.List;

public interface UserGateway {

    User save(User user);

    List<User> searchUser() throws Exception;

    void deleteUser(String id);
}

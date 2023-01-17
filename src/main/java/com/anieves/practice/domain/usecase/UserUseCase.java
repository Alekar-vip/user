package com.anieves.practice.domain.usecase;

import com.anieves.practice.domain.gateway.UserGateway;
import com.anieves.practice.domain.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
public class UserUseCase {

    private final UserGateway userGateway;

    public User saveUser(User user) {
        return userGateway.save(user);
    }

    public List<User> searchUser() throws Exception {
        return userGateway.searchUser();
    }


    public void deleteUser(Long id) {
        userGateway.deleteUser(String.valueOf(id));
    }


}

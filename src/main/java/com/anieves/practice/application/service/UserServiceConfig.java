package com.anieves.practice.application.service;

import com.anieves.practice.domain.gateway.UserGateway;
import com.anieves.practice.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfig {


    @Bean
    public UserUseCase userService(UserGateway userGateway) {
        return new UserUseCase(userGateway);
    }

}

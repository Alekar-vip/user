package com.anieves.practice.infrastructure.rest.spring.controller;

import com.anieves.practice.domain.model.User;
import com.anieves.practice.domain.usecase.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserUseCase userService;

    @PostMapping("user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("search")
    public ResponseEntity<List<User>> getAllUsers() throws Exception {
        return new ResponseEntity<>(userService.searchUser(), HttpStatus.OK);
    }

    @DeleteMapping("delete-user")
    public void deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
    }

}

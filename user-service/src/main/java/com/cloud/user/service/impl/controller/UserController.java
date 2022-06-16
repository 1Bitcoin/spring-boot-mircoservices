package com.cloud.user.service.impl.controller;

import com.cloud.user.service.api.service.UserService;
import com.cloud.user.service.impl.entity.User;
import com.cloud.user.service.impl.vo.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public User saveDepartment(@RequestBody User user) {
        log.info("Вызван метод сохранения пользователя: {}", user);
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserResponse getUserInfoByUserId(@PathVariable("id") Long userId) {
        log.info("Вызван метод получения информации о пользователе с id: {}", userId);
        return userService.getUserInfoByUserId(userId);
    }

}

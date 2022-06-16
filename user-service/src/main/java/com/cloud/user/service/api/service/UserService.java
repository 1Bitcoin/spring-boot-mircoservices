package com.cloud.user.service.api.service;

import com.cloud.user.service.impl.entity.User;
import com.cloud.user.service.impl.vo.UserResponse;

/**
 * Сервис для работы с пользователями
 */
public interface UserService {

    User saveUser(User user);

    UserResponse getUserInfoByUserId(Long userId);
}

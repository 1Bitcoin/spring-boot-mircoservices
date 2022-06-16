package com.cloud.user.service.impl.vo;

import com.cloud.user.service.impl.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private User user;
    private Department department;
}

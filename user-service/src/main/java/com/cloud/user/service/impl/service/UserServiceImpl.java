package com.cloud.user.service.impl.service;


import com.cloud.user.service.api.service.UserService;
import com.cloud.user.service.impl.entity.User;
import com.cloud.user.service.impl.repository.UserRepository;
import com.cloud.user.service.impl.vo.Department;
import com.cloud.user.service.impl.vo.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    public UserServiceImpl(UserRepository userRepository, RestTemplate restTemplate) {
        this.userRepository = userRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public UserResponse getUserInfoByUserId(Long userId) {
        UserResponse userResponse = new UserResponse();

        User user = userRepository.findUserByUserId(userId);
        Department department = restTemplate.getForObject(
                "http://localhost:9001/departments/" + user.getDepartmentId(),
                Department.class);

        userResponse.setUser(user);
        userResponse.setDepartment(department);

        return userResponse;
    }
}

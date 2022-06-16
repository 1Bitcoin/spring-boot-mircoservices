package com.cloud.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    @GetMapping("/circuit-breaker-user-service")
    public String circuitBreakerUserService() {
        return "user-service on tech break";
    }
    @GetMapping("/circuit-breaker-department-service")
    public String circuitBreakerDepartmentService() {
        return "department-service on tech break";
    }
}

package com.cloud.department.service.impl.contoller;

import com.cloud.department.service.api.service.DepartmentService;
import com.cloud.department.service.impl.entity.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping()
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Вызван метод сохранения департмента: {}", department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Вызван метод получения департмента с id: {}", departmentId);
        return departmentService.findDepartmentById(departmentId);
    }
}

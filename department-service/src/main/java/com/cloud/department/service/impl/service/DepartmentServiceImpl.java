package com.cloud.department.service.impl.service;

import com.cloud.department.service.api.service.DepartmentService;
import com.cloud.department.service.impl.entity.Department;
import com.cloud.department.service.impl.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}

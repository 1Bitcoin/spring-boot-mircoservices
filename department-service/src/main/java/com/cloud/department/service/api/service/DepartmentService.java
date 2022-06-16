package com.cloud.department.service.api.service;

import com.cloud.department.service.impl.entity.Department;

/**
 * Сервис для работы с департаментами
 */
public interface DepartmentService {

    Department saveDepartment(Department department);

    Department findDepartmentById(Long departmentId);
}

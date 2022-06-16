package com.cloud.department.service.impl.repository;

import com.cloud.department.service.impl.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentByDepartmentId(Long departmentId);
}

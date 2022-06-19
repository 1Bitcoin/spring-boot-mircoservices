package com.cloud.department.service.impl.contoller;

import com.cloud.department.service.api.service.DepartmentService;
import com.cloud.department.service.impl.entity.Department;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private final DepartmentService departmentService;
    private final MeterRegistry meterRegistry;

    private final Counter saveCounter;
    private final Counter findCounter;

    private final AtomicInteger testGauge;

    public DepartmentController(DepartmentService departmentService, MeterRegistry meterRegistry) {
        this.departmentService = departmentService;
        this.meterRegistry = meterRegistry;

        testGauge = meterRegistry.gauge("custom_gauge", new AtomicInteger(0));
        saveCounter = meterRegistry.counter("save_counter");
        findCounter = meterRegistry.counter("find_counter");
    }

    @PostMapping()
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Вызван метод сохранения департмента: {}", department);
        testGauge.set(departmentService.getRandomNumberInRange(0, 100));
        saveCounter.increment();

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Вызван метод получения департмента с id: {}", departmentId);
        findCounter.increment();

        return departmentService.findDepartmentById(departmentId);
    }
}

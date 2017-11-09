package com.databps.bigdaf.gateway.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databps.bigdaf.gateway.rest.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}

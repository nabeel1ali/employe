package com.learning.employe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.employe.model.Department;
import com.learning.employe.repository.customized.CustomizedDepartmentRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>, CustomizedDepartmentRepository {

	List<Department> getByDeptNameContainingIgnoreCase(String deptName);

}

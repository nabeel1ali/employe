package com.learning.employe.repository.customized;

import java.util.List;

import com.learning.employe.model.Department;

public interface CustomizedDepartmentRepository {

	Department getDepartmentById(Long id);

	List<Department> getAllDepartments();

}

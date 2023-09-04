package com.learning.employe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.employe.model.Department;
import com.learning.employe.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		return departmentRepository.getAllDepartments();
	}

	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	public Department getById(Long id) {
		return departmentRepository.findById(id).orElse(null);
	}

	public void delete(Department existingDepartmnet) {
		departmentRepository.delete(existingDepartmnet);
	}

	public Department getDepartmentById(Long id) {
		return departmentRepository.getDepartmentById(id);
	}

	public List<Department> getByDeptName(String deptName) {
		return departmentRepository.getByDeptNameContainingIgnoreCase(deptName);
	}

}

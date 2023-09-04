package com.learning.employe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.repository.EmployeeDepartmentRepository;

@Service
public class EmployeeDepartmentService {
	@Autowired
	private EmployeeDepartmentRepository employeeDepartmentRepository;

	public EmployeeDepartment save(EmployeeDepartment input) {
		return employeeDepartmentRepository.save(input);
	}

	public EmployeeDepartment getById(Long id) {
		return employeeDepartmentRepository.findById(id).orElse(null);
	}

	public List<EmployeeDepartment> getEmployeeDepartmentByDepartmentId(Long id) {
		return employeeDepartmentRepository.getEmployeeDepartmentByDepartmentId(id);
	}

//	public List<EmployeeDepartment> getEmployeeDepartmentByEmployeeId(Long id) {
//		return employeeDepartmentRepository.getEmployeeDepartmentByEmployeeId(id);
//	}
	public EmployeeDepartment getEmployeeDepartmentByEmployeeId(Long id) {
		return employeeDepartmentRepository.getEmployeeDepartmentByEmployeeId(id);
	}

	public void delete(EmployeeDepartment employeeDepartment) {
		employeeDepartmentRepository.delete(employeeDepartment);
	}
}

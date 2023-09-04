package com.learning.employe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.operations.employeedepartment.DeleteEmployeeDepartmentOperation;
import com.learning.employe.service.EmployeeDepartmentService;

@RestController
@RequestMapping("/api/employeedepartment")
public class EmployeeDepartmentController {
	@Autowired
	private EmployeeDepartmentService employeeDepartmentService;

	@GetMapping("/{id}")
	public EmployeeDepartment getEmployeeDepartmentById(@PathVariable("id") Long id) {
		return employeeDepartmentService.getById(id);
	}

	@GetMapping("/department/{id}")
	public ResponseEntity<List<EmployeeDepartment>> getEmployeeDepartmentByDepartmentId(@PathVariable("id") Long id) {
		List<EmployeeDepartment> employeeDepartments = employeeDepartmentService
				.getEmployeeDepartmentByDepartmentId(id);
		return ResponseEntity.ok(employeeDepartments);
	}

//	@GetMapping("/employee/{id}")
//	public ResponseEntity<List<EmployeeDepartment>> getEmployeeDepartmentByEmployeeId(@PathVariable("id") Long id) {
//		List<EmployeeDepartment> employeeDepartments = employeeDepartmentService.getEmployeeDepartmentByEmployeeId(id);
//		return ResponseEntity.ok(employeeDepartments);
//	}

	@DeleteMapping("/{id}")
	public EmployeeDepartment deleteEmployeeDepartment(@PathVariable("id") Long id) {
		return new DeleteEmployeeDepartmentOperation(id).execute();
	}
	
	@GetMapping("/employee/{id}")
	public EmployeeDepartment getEmployeeDepartmentByEmployeeId1(@PathVariable("id") Long id) {
		return employeeDepartmentService.getEmployeeDepartmentByEmployeeId(id);
	}
}

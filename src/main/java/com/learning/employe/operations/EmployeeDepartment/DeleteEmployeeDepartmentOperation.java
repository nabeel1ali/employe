package com.learning.employe.operations.employeedepartment;

import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.service.EmployeeDepartmentService;
import com.learning.employe.utils.BeanUtil;

public class DeleteEmployeeDepartmentOperation {
	
	private final Long id;
	
	private final EmployeeDepartmentService edService;

	public DeleteEmployeeDepartmentOperation(final Long id) {
		this.id = id;
		this.edService = BeanUtil.getBean(EmployeeDepartmentService.class);
	}
	
	public EmployeeDepartment execute() {
		final EmployeeDepartment existingEmployeeDepartment = edService.getById(id);
		edService.delete(existingEmployeeDepartment);
		return (existingEmployeeDepartment);
	}
}

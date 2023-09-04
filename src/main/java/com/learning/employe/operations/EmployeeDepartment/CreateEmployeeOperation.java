package com.learning.employe.operations.EmployeeDepartment;

import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.service.EmployeeDepartmentService;
import com.learning.employe.utils.BeanUtil;

public class CreateEmployeeOperation {

	private final EmployeeDepartment input;
	private final EmployeeDepartmentService employeeDepartmentService;

	public CreateEmployeeOperation(final EmployeeDepartment employeeDepartment) {
		this.input = employeeDepartment;
		this.employeeDepartmentService = BeanUtil.getBean(EmployeeDepartmentService.class);
	}

	public EmployeeDepartment execute() {
		employeeDepartmentService.save(input);
		return input;
	}

}

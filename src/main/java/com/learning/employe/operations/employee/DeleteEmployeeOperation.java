package com.learning.employe.operations.employee;

import com.learning.employe.model.Employee;
import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.service.EmployeeDepartmentService;
import com.learning.employe.service.EmployeeService;
import com.learning.employe.utils.BeanUtil;

public class DeleteEmployeeOperation {
	private final Long id;
	private final EmployeeService employeeService;
	private final EmployeeDepartmentService edService;

	public DeleteEmployeeOperation(final Long id) {
		this.id = id;
		this.employeeService = BeanUtil.getBean(EmployeeService.class);
		this.edService = BeanUtil.getBean(EmployeeDepartmentService.class);

	}

	public String execute() {
		final Employee existingEmployee = employeeService.getById(id);

		EmployeeDepartment existingemployeeDepartment = edService.getEmployeeDepartmentByEmployeeId(id);
		edService.delete(existingemployeeDepartment);

		employeeService.delete(existingEmployee);
		return "redirect:/api/employe/";
	}
}

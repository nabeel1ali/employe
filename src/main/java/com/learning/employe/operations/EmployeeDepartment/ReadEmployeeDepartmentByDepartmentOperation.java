package com.learning.employe.operations.EmployeeDepartment;

import com.learning.employe.model.Department;
import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.service.EmployeeDepartmentService;
import com.learning.employe.utils.BeanUtil;

public class ReadEmployeeDepartmentByDepartmentOperation {
	private final Long id;
	private EmployeeDepartmentService edService;
	private DepartmentService dService;

	public ReadEmployeeDepartmentByDepartmentOperation(Long id) {
		this.id = id;
		this.edService = BeanUtil.getBean(EmployeeDepartmentService.class);
		this.dService = BeanUtil.getBean(DepartmentService.class);
	}

	public EmployeeDepartment execute() {
		@SuppressWarnings("unused")
		Department department = dService.getById(id);
		return (edService.getById(id));
	}

}

package com.learning.employe.operations.department;

import com.learning.employe.model.Department;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.utils.BeanUtil;

public class DeleteDepartmentOperation {
	private final Long id;
	private final DepartmentService departmentService;

	public DeleteDepartmentOperation(final Long id) {
		this.id = id;
		this.departmentService = BeanUtil.getBean(DepartmentService.class);
	}

	public String execute() {
		final Department existingDepartmnet = departmentService.getDepartmentById(id);
		departmentService.delete(existingDepartmnet);
		return "redirect:/api/department/";
	}
}

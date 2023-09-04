package com.learning.employe.operations.employee;

import java.util.List;

import com.learning.employe.model.Department;
import com.learning.employe.model.Employee;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.service.EmployeeService;
import com.learning.employe.utils.BeanUtil;

public class ReadByDepartmentOperation {

	private final Long id;
	
	private EmployeeService eService;
	private DepartmentService dService;

	public ReadByDepartmentOperation(Long departmentId) {
		this.id = departmentId;
		this.eService = BeanUtil.getBean(EmployeeService.class);
		this.dService = BeanUtil.getBean(DepartmentService.class);
	}
	
	public List<Employee> execute() {
		Department department = dService.getById(id);
		List<Employee> employess = eService.getByDepartment(department.getId());
		return employess;
	}
}

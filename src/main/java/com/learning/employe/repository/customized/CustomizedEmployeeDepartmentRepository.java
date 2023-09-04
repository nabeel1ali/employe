package com.learning.employe.repository.customized;

import java.util.List;

import com.learning.employe.model.EmployeeDepartment;

public interface CustomizedEmployeeDepartmentRepository {
	
	List<EmployeeDepartment> getEmployeeDepartmentByDepartmentId(Long id);

	//List<EmployeeDepartment> getEmployeeDepartmentByEmployeeId(Long id);
	
	EmployeeDepartment getEmployeeDepartmentByEmployeeId(Long id);

}

package com.learning.employe.repository.customized;

import com.learning.employe.model.Employee;

public interface CustomizedEmployeeRepository {

//	List<Employee> getByDepartment(Long departmentId);

	Employee getEmployeeById(Long id);

//	List<Employee> getAllEmployees();

//	List<Employee> searchFilter(String firstName, String lastName, String deptName);

}

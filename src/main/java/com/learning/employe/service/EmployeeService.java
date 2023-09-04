package com.learning.employe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.employe.model.Employee;
import com.learning.employe.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public List<Employee> getByDepartment(Long departmentId) {
		return employeeRepository.getByDepartment(departmentId);
	}

	public Employee getEmployeeById(Long id) {
		return employeeRepository.getEmployeeById(id);
	}

	public void delete(Employee existingEmployee) {
		employeeRepository.delete(existingEmployee);
	}

	public Employee getEmployeeByFirstName(String firstName) {
		return employeeRepository.getEmployeeByFirstName(firstName);
	}

	public List<Employee> searchFilter(String firstName, String lastName, String deptName) {
		return employeeRepository.searchFilterContainingIgnoreCase(firstName,lastName,deptName);
	}
}

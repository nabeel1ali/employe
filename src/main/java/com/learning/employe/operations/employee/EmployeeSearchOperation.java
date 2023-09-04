package com.learning.employe.operations.employee;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Employee;
import com.learning.employe.service.EmployeeService;
import com.learning.employe.utils.BeanUtil;

public class EmployeeSearchOperation {

	private final String firstName;
	private final String lastName;
	private final String deptName;
	private final EmployeeService eService;

	public EmployeeSearchOperation(String firstName, String lastName, String deptName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
		this.eService = BeanUtil.getBean(EmployeeService.class);
	}

	public ModelAndView execute() {
		List<Employee> employees = eService.searchFilter(firstName, lastName,deptName);
		ModelAndView modelAndView = new ModelAndView("employee");
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}

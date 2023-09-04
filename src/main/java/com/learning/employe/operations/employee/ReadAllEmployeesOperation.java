package com.learning.employe.operations.employee;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Employee;
import com.learning.employe.service.EmployeeService;
import com.learning.employe.utils.BeanUtil;

public class ReadAllEmployeesOperation {
	private final EmployeeService eService;

	public ReadAllEmployeesOperation() {
		this.eService = BeanUtil.getBean(EmployeeService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView("employee");
		List<Employee> employeeList = eService.getAllEmployee();
		mav.addObject("employees", employeeList);
		return mav;
	}

	// final List<Employee> employee = eService.getAllEmployee();
	// return employee;

}

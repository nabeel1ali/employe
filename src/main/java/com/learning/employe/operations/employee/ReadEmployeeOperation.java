package com.learning.employe.operations.employee;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.model.Employee;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.service.EmployeeService;
import com.learning.employe.utils.BeanUtil;

public class ReadEmployeeOperation {
	
//	private final String firstName;
	private final Long id;

	private final EmployeeService eService;
	private final DepartmentService dService;

	public ReadEmployeeOperation(final Long id) {
		this.id = id;
		this.eService = BeanUtil.getBean(EmployeeService.class);
		this.dService = BeanUtil.getBean(DepartmentService.class);
	}
	
	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView("update_employee");
		final Employee employee = eService.getById(id);
		List<Department> departments = dService.getAllDepartments();
		mav.addObject("departments", departments);
		mav.addObject("employe", employee);
		return mav;
	}
}

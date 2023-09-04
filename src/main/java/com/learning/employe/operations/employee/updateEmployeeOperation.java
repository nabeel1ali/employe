package com.learning.employe.operations.employee;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.model.Employee;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.service.EmployeeService;
import com.learning.employe.utils.BeanUtil;

public class updateEmployeeOperation {
	
	private final Employee input;
	private final BindingResult result;
	
	private final EmployeeService employeeService;
	private final DepartmentService dService;

	public updateEmployeeOperation(final Employee employee, BindingResult result) {
		this.input = employee;
		this.result = result;
		this.employeeService = BeanUtil.getBean(EmployeeService.class);
		this.dService = BeanUtil.getBean(DepartmentService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("update_employee");
			List<Department> departments = dService.getAllDepartments();
			mav.addObject("departments", departments);
			mav.addObject("employe", input);
			return mav;
		}
		
		employeeService.save(input);
		mav.setViewName("redirect:/api/employe/");
		return mav;
	}
}

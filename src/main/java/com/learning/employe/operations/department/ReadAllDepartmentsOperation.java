package com.learning.employe.operations.department;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.utils.BeanUtil;

public class ReadAllDepartmentsOperation {
	private final DepartmentService departmentService;

	public ReadAllDepartmentsOperation() {
		this.departmentService = BeanUtil.getBean(DepartmentService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView("department");
		final List<Department> departmentList = departmentService.getAllDepartments();
		mav.addObject("departments", departmentList);
		return mav;
	}

}

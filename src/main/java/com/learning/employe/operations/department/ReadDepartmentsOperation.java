package com.learning.employe.operations.department;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.utils.BeanUtil;

public class ReadDepartmentsOperation {

	private final String deptName;
	private final DepartmentService departmentService;

	public ReadDepartmentsOperation(final String deptName) {
		this.deptName = deptName;
		this.departmentService = BeanUtil.getBean(DepartmentService.class);
	}

	public ModelAndView execute() {
		List<Department> departments = departmentService.getByDeptName(deptName);
		ModelAndView mav = new ModelAndView("department");
		mav.addObject("departments", departments);
		return mav;
	}
}

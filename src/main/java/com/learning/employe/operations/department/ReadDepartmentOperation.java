package com.learning.employe.operations.department;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.utils.BeanUtil;

public class ReadDepartmentOperation {

	private final Long id;
	private final DepartmentService departmentService;

	public ReadDepartmentOperation(final Long id) {
		this.id = id;
		this.departmentService = BeanUtil.getBean(DepartmentService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView("update_department");
		final Department department = departmentService.getById(id);
		mav.addObject("department", department);
		return mav;
	}
}

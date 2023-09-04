package com.learning.employe.operations.department;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.service.DepartmentService;
import com.learning.employe.utils.BeanUtil;

public class CreateDepartmentOperation {

	private final Department input;
	private final BindingResult result;
	
	private final DepartmentService departmentService;

	public CreateDepartmentOperation(final Department department, BindingResult result) {
		this.input = department;
		this.result =result;
		this.departmentService = BeanUtil.getBean(DepartmentService.class);
	}
	
	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("add_department");
			mav.addObject("department", input);
			return mav;
		}
		departmentService.save(input);
		mav.setViewName("redirect:/api/department/");
		return mav;
	}
}

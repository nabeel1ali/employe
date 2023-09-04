package com.learning.employe.operations.user;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.User;
import com.learning.employe.service.UserService;
import com.learning.employe.utils.BeanUtil;

public class ReadAllUsersOperation {
	private final UserService uService;

	public ReadAllUsersOperation() {
		this.uService = BeanUtil.getBean(UserService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView("user");
		List<User> userList = uService.getAllUsers();
		mav.addObject("users", userList);
		return mav;
	}

	// final List<Employee> employee = eService.getAllEmployee();
	// return employee;

}

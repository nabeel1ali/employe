package com.learning.employe.operations.user;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.User;
import com.learning.employe.service.UserService;
import com.learning.employe.utils.BeanUtil;

public class SearchFilterOperation {

	private final String firstName;
	private final String lastName;
	private final String userName;

	private final UserService uService;

	public SearchFilterOperation(final String firstName, final String lastName, String userName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.uService = BeanUtil.getBean(UserService.class);
	}

	public ModelAndView execute() {
		List<User> users = uService.searchFilter(firstName, lastName, userName);
		ModelAndView modelAndView = new ModelAndView("user");
		modelAndView.addObject("users", users);
		return modelAndView;
	}
}
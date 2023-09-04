package com.learning.employe.operations.user;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.User;
import com.learning.employe.service.UserService;
import com.learning.employe.utils.BeanUtil;

public class ReadUserOperation {

//	private final String firstName;
	private final Long id;

	private final UserService uService;

	public ReadUserOperation(final Long id) {
		this.id = id;
		this.uService = BeanUtil.getBean(UserService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView("update_user");
		final User user = uService.getById(id);
		mav.addObject("user", user);
		return mav;

	}
}

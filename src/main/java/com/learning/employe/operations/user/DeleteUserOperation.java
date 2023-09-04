package com.learning.employe.operations.user;

import com.learning.employe.model.User;
import com.learning.employe.service.UserService;
import com.learning.employe.utils.BeanUtil;

public class DeleteUserOperation {
	private final Long id;
	private final UserService uService;

	public DeleteUserOperation(final Long id) {
		this.id = id;
		this.uService = BeanUtil.getBean(UserService.class);

	}

	public String execute() {
		final User existingUser = uService.getById(id);
		uService.delete(existingUser);
		return "redirect:/api/user/";
	}
}

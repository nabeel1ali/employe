package com.learning.employe.operations.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.User;
import com.learning.employe.service.UserService;
import com.learning.employe.utils.BeanUtil;

public class CreateUserOperation {

	private final User input;
	private final BindingResult result;
	private final UserService uService;

	public CreateUserOperation(final User user, BindingResult result) {
		this.input = user;
		this.result=result;
		this.uService = BeanUtil.getBean(UserService.class);
	}

	public ModelAndView execute() {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("registration");
			mav.addObject("user", input);
			return mav;
		}
		
		String userNamePattern = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		Pattern pattern = Pattern.compile(userNamePattern);
		String userName = input.getUserName();
		Matcher matcher = pattern.matcher(userName);
		if (!matcher.matches()) {
			mav.setViewName("registration");
			mav.addObject("user", input);
			mav.addObject("errorMessage", "Invalid username, doesn't match with the pattern.");
			return mav;
		}
		
		String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		Pattern patter = Pattern.compile(emailPattern);
		String email = input.getEmail();
		Matcher matche = patter.matcher(email);
		if (!matche.matches()) {
			mav.setViewName("registration");
			mav.addObject("user", input);
			mav.addObject("errorMessage", "Invalid email, doesn't match with the pattern.");
			return mav;
		}

		User user = uService.getByUserName(userName);
		if (user != null) {
			mav.setViewName("registration");
			mav.addObject("user", input);
			mav.addObject("errorMessage", "Invalid user, username already exists.");
			return mav;
		}
		User users = uService.getByEmail(email);
		if (users != null) {
			mav.setViewName("registration");
			mav.addObject("user", input);
			mav.addObject("errorMessage", "Invalid email, email already exists.");
			return mav;
		}

		uService.save(input);
		mav.setViewName("redirect:/api/user/");
		return mav;
	}

}

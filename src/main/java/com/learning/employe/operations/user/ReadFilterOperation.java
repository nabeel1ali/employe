package com.learning.employe.operations.user;

import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.User;
import com.learning.employe.service.UserService;
import com.learning.employe.utils.BeanUtil;

public class ReadFilterOperation {
	private final String userName;
	private final String password;

	private final UserService uService;

	public ReadFilterOperation(final String userName, final String password) {
		this.userName = userName;
		this.password = password;
		this.uService = BeanUtil.getBean(UserService.class);
	}
	
	public ModelAndView execute(){
	    final User user = uService.getByUsernameAndPassword(userName, password);
	    ModelAndView mav = new ModelAndView();

	    if (user != null) {
	        mav.setViewName("ems");
	        mav.addObject("user", user);
	    } else {
	        mav.setViewName("login");
	        mav.addObject("user", new User());
	        mav.addObject("errorMessage", "Invalid username or password");
	    }

	    return mav;
	
	


//	public ModelAndView execute(){
//		final User user = uService.getByUsernameAndPassword(userName, password);
//		if (user != null) {
//			ModelAndView mav = new ModelAndView("ems");
//			mav.addObject("user", user);
//			return mav;
//		}
//		return null;

		// null check before calling
		// get by username
		// check if equal then go next page or else give error

		// user match
	}
}

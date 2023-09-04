package com.learning.employe.controller;

import javax.servlet.annotation.WebServlet;
import javax.validation.Valid;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.User;
import com.learning.employe.operations.user.CreateUserOperation;
import com.learning.employe.operations.user.DeleteUserOperation;
import com.learning.employe.operations.user.ReadAllUsersOperation;
import com.learning.employe.operations.user.ReadFilterOperation;
import com.learning.employe.operations.user.ReadUserOperation;
import com.learning.employe.operations.user.SearchFilterOperation;
import com.learning.employe.operations.user.UpdateUserOperation;

@WebServlet
@Controller
@RequestMapping("/api/user")
public class UserController {
	@GetMapping("/")
	public ModelAndView getAllUsers() {
		return new ReadAllUsersOperation().execute();
	}

	@GetMapping("/signIn")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new User());
		return mav;
	}

	@GetMapping("/new")
	public ModelAndView addUser() {
		ModelAndView mav = new ModelAndView("registration");
		mav.addObject("user", new User());
		return mav;
	}

	@PostMapping("/save")
	public ModelAndView createUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
		return new CreateUserOperation(user, result).execute();
	}

	@GetMapping("/{id}")
	public ModelAndView updateUserById(@PathVariable("id") Long id) {
		return new ReadUserOperation(id).execute();
	}

	@PostMapping("/update")
	public ModelAndView updateUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
		return new UpdateUserOperation(user, result).execute();
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Long id) {
		return new DeleteUserOperation(id).execute();
	}

	@PostMapping("/login")
	public ModelAndView getByUsernameAndPassword(@Param("userName") final String userName,
			@Param("password") final String password) {
		return new ReadFilterOperation(userName, password).execute();
	}

	@GetMapping("/search")
	public ModelAndView search(@RequestParam("firstName") final String firstName,@RequestParam("lastName") final String lastName,@RequestParam("userName") final String userName) {
		return new SearchFilterOperation(firstName, lastName,userName).execute();
	}
}
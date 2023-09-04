package com.learning.employe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.employe.model.User;
import com.learning.employe.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepository;

	public User getById(Long id) {
		return uRepository.findById(id).orElse(null);
	}

	public User save(User user) {
		return uRepository.save(user);
	}

	public List<User> getAllUsers() {
		return uRepository.findAll();
	}

	public User getByUsernameAndPassword(String userName, String password) {
		if (userName != null && password != null) {
			return uRepository.getByUsernameAndPassword(userName, password);
		}
		return null;
	}

	public void delete(User existingUser) {
		uRepository.delete(existingUser);

	}

	public User getByUserName(String userName) {
		return uRepository.getByUserName(userName);

	}

	public User getByEmail(String email) {
		return uRepository.getByEmail(email);
	}

	public List<User> findByFirstnameContainingIgnoreCase(String firstName) {
		return uRepository.getUsersByFirstNameContainingIgnoreCase(firstName);
	}

	public List<User> searchFilter(String firstName, String lastName, String userName) {
		return uRepository.searchFilter(firstName,lastName,userName);

	}
}

package com.learning.employe.repository.customized;

import java.util.List;

import com.learning.employe.model.User;

public interface CustomizedUserRepository {

	 List<User> searchFilter(String firstName, String lastName, String userName);

}

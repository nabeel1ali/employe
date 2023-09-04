package com.learning.employe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learning.employe.model.User;
import com.learning.employe.repository.customized.CustomizedUserRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, CustomizedUserRepository {

	@Query(value = "SELECT *FROM public.users WHERE user_name =:userName AND password=:password ", nativeQuery = true)
	User getByUsernameAndPassword(String userName, String password);
	
	//List<User> getByUserName(String userName);

	User getByEmail(String email);

	User getByUserName(String userName);

	List<User> getUsersByFirstNameContainingIgnoreCase(String firstName);

//	@Query(value = "SELECT * FROM users u WHERE LOWER(u.first_name) LIKE %:firstName% AND LOWER(u.last_name) LIKE %:lastName% AND LOWER(u.user_name) LIKE %:userName%", nativeQuery = true)
//	  List<User> searchFilterContainingIgnoreCase(@Param("firstName") String firstName,@Param("lastName") String lastName,@Param("userName") String userName);

}


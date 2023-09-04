package com.learning.employe.repository.customized.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learning.employe.model.User;
import com.learning.employe.repository.customized.CustomizedUserRepository;

@Repository
public class CustomizedUserRepositoryImpl implements CustomizedUserRepository {
	private final EntityManager entityManager;

	@Autowired
	public CustomizedUserRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<User> searchFilter(String firstName, String lastName, String userName) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> user = cq.from(User.class);
		
		final List<Predicate> criterias = new ArrayList<>();
		if(firstName != null && !firstName.trim().isBlank())	criterias.add(cb.like(cb.lower(user.get("firstName")), "%" + firstName.toLowerCase() + "%"));
		if(lastName != null && !lastName.trim().isBlank())		criterias.add(cb.like(cb.lower(user.get("lastName")), "%" + lastName.toLowerCase() + "%"));
		if(userName != null && !userName.trim().isBlank())		criterias.add(cb.like(cb.lower(user.get("userName")), "%" + userName.toLowerCase() + "%"));
		
		cq.where(criterias.stream().toArray(Predicate[]::new));
		return entityManager.createQuery(cq).getResultList();
	}
}
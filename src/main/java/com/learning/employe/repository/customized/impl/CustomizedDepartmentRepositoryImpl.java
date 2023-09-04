package com.learning.employe.repository.customized.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.employe.model.Department;
import com.learning.employe.repository.customized.CustomizedDepartmentRepository;

@Component
public class CustomizedDepartmentRepositoryImpl implements CustomizedDepartmentRepository {
	private final EntityManager entityManager;

	@Autowired
	public CustomizedDepartmentRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Department> getAllDepartments() {
		String jpql = "SELECT d FROM Department d";
		TypedQuery<Department> query = entityManager.createQuery(jpql, Department.class);
		return query.getResultList();
	}

	@Override
	public Department getDepartmentById(Long id) {
		String nativeQuery = "SELECT d.* " + " FROM public.departments d " + " WHERE d.id = " + id;
		Query query = entityManager.createNativeQuery(nativeQuery, Department.class);
		return (Department) query.getSingleResult();
	}
}

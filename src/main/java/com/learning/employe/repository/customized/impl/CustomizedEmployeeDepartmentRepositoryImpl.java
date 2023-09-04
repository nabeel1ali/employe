package com.learning.employe.repository.customized.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.repository.customized.CustomizedEmployeeDepartmentRepository;

@Component
public class CustomizedEmployeeDepartmentRepositoryImpl implements CustomizedEmployeeDepartmentRepository {
	private final EntityManager entityManager;

	@Autowired
	public CustomizedEmployeeDepartmentRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDepartment> getEmployeeDepartmentByDepartmentId(Long id) {
		String nativeQuery = "SELECT * From employee_department ed "
				+ "INNER JOIN departments d ON ed.department_id = d.id "
				+ "WHERE d.id = " + id;
		Query query = entityManager.createNativeQuery(nativeQuery, EmployeeDepartment.class);
		return query.getResultList();
	}

	@Override
	public EmployeeDepartment getEmployeeDepartmentByEmployeeId(Long id) {
		String nativeQuery = "SELECT *From employee_department ed "
				+ "INNER JOIN employees e ON ed.employees_id = e.id "
				+ "WHERE e.id = " + id;
		Query query = entityManager.createNativeQuery(nativeQuery, EmployeeDepartment.class);
		return (EmployeeDepartment) query.getSingleResult();
	}

}

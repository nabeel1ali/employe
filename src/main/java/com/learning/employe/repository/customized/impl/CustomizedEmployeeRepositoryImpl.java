package com.learning.employe.repository.customized.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.employe.model.Employee;
import com.learning.employe.repository.customized.CustomizedEmployeeRepository;

@Component
public class CustomizedEmployeeRepositoryImpl implements CustomizedEmployeeRepository {
	private final EntityManager entityManager;

	@Autowired
	public CustomizedEmployeeRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

//	@SuppressWarnings("unchecked")
//	public List<Employee> getAllEmployees() {
//		String nativeQuery = "SELECT *FROM public.employees  ";
//		Query query = entityManager.createNativeQuery(nativeQuery, Employee.class);
//		return query.getResultList();
//	}

//	@SuppressWarnings("unchecked")
//	public List<Employee> getAllEmployeeByDepartment(Long departmentId) {
//		String nativeQuery = "SELECT e.* " + " FROM public.employees e "
//				+ " JOIN employee_department ed ON e.id = ed.employees_id " + " WHERE ed.department_id =" + departmentId;
//		Query query = entityManager.createNativeQuery(nativeQuery, Employee.class);
//		return query.getResultList();
//	}

//	@SuppressWarnings("unchecked")
//	public List<Employee> getByDepartment(Long departmentId) {
//		String nativeQuery = "SELECT *FROM public.employees WHERE department_id ="+ departmentId;
//		Query query = entityManager.createNativeQuery(nativeQuery, Employee.class);
//		return query.getResultList();
//	}

	@Override
	public Employee getEmployeeById(Long id) {
		String nativeQuery = "SELECT e.* " + " FROM public.employees e " + " WHERE e.id = " + id;
		Query query = entityManager.createNativeQuery(nativeQuery, Employee.class);
		return (Employee) query.getSingleResult();
	}

//	@Override
//	public List<Employee> searchFilter(String firstName, String lastName, String deptName) {
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
//		Root<User> user = cq.from(User.class);
//
//		final List<Predicate> criterias = new ArrayList<>();
//		if (firstName != null && !firstName.trim().isBlank())	criterias.add(cb.like(cb.lower(user.get("firstName")), "%" + firstName.toLowerCase() + "%"));
//		if (lastName != null && !lastName.trim().isBlank())		criterias.add(cb.like(cb.lower(user.get("lastName")), "%" + lastName.toLowerCase() + "%"));
//		if (deptName != null && !deptName.trim().isBlank())		criterias.add(cb.like(cb.lower(user.get("deptName")), "%" + deptName.toLowerCase() + "%"));
//
//		cq.where(criterias.stream().toArray(Predicate[]::new));
//		return entityManager.createQuery(cq).getResultList();
//	}
}

package com.learning.employe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.employe.model.Department;
import com.learning.employe.model.Employee;
import com.learning.employe.repository.customized.CustomizedEmployeeRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, CustomizedEmployeeRepository {

	List<Employee> findByDepartment(final Department department);

	@Query(value = "SELECT *FROM public.employees WHERE department_id =:departmentId", nativeQuery = true)
	List<Employee> getByDepartment(Long departmentId);

	Employee getEmployeeByFirstName(String firstName);

	List<Employee> getByFirstNameContainingIgnoreCase(String firstName);

//	@Query(value = "SELECT e.* FROM employees e INNER JOIN departments d ON e.department_id = d.id WHERE lower(e.first_name) LIKE lower(:firstName) AND lower(e.last_name) LIKE lower(:lastName) AND lower(d.dept_name) LIKE lower(:dept_name)", nativeQuery = true)
//	List<Employee> searchFilter(String firstName, String lastName, String deptName);
	
	@Query(value = "SELECT * FROM employees e INNER JOIN departments d ON e.department_id = d.id Where LOWER(e.first_name) LIKE %:firstName% AND LOWER(e.last_name) LIKE %:lastName% AND LOWER(d.dept_name) LIKE %:deptName%", nativeQuery = true)
	List<Employee> searchFilterContainingIgnoreCase(@Param("firstName") String firstName, @Param("lastName") String lastName,@Param("deptName") String deptName);
}

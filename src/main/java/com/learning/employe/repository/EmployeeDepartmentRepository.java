package com.learning.employe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.employe.model.EmployeeDepartment;
import com.learning.employe.repository.customized.CustomizedEmployeeDepartmentRepository;

@Repository
public interface EmployeeDepartmentRepository extends JpaRepository<EmployeeDepartment, Long>, CustomizedEmployeeDepartmentRepository {

}

package com.learning.employe.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.employe.model.Department;
import com.learning.employe.model.Employee;
import com.learning.employe.operations.employee.CreateEmployeeOperation;
import com.learning.employe.operations.employee.DeleteEmployeeOperation;
import com.learning.employe.operations.employee.EmployeeSearchOperation;
import com.learning.employe.operations.employee.ReadAllEmployeesOperation;
import com.learning.employe.operations.employee.ReadByDepartmentOperation;
import com.learning.employe.operations.employee.ReadEmployeeOperation;
import com.learning.employe.operations.employee.updateEmployeeOperation;
import com.learning.employe.service.DepartmentService;

@Controller
@RequestMapping("/api/employe")
public class EmployeeController {

	@Autowired
	private DepartmentService dService;

	@GetMapping("/")
	public ModelAndView GetAllEmployees() {
		return new ReadAllEmployeesOperation().execute();
	}

	@GetMapping("/new")
	public ModelAndView addEmployee() {
		ModelAndView mav = new ModelAndView("add_employee");
		List<Department> departments = dService.getAllDepartments();
		mav.addObject("departments", departments);
		mav.addObject("employee", new Employee());
		return mav;
	}

	@PostMapping("/save")
	public ModelAndView createEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		return new CreateEmployeeOperation(employee, result).execute();
	}

	@GetMapping("/{id}")
	public ModelAndView updateEmployeeById(@PathVariable("id") Long id) {
		return new ReadEmployeeOperation(id).execute();
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		return new DeleteEmployeeOperation(id).execute();
	}

	@GetMapping("/department/{id}")
	public List<Employee> findByDepartment(@PathVariable("id") Long departmentId) {
		return new ReadByDepartmentOperation(departmentId).execute();
	}

	@PostMapping("/update")
	public ModelAndView updateEmployee(@Valid @ModelAttribute("employe") Employee employee, BindingResult result) {
		return new updateEmployeeOperation(employee, result).execute();
	}

	@GetMapping("/search")
	public ModelAndView search(@RequestParam("firstName") final String firstName,@RequestParam("lastName") final String lastName, @RequestParam("deptName") final String deptName) {
		return new EmployeeSearchOperation(firstName, lastName, deptName).execute();
	}

//	@GetMapping("/{firstName}")
//	public Employee getEmployeeByFirstName(@PathVariable("firstName") String firstName) {
//		return new ReadEmployeeOperation(firstName).execute();
//	}
}

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
import com.learning.employe.operations.department.CreateDepartmentOperation;
import com.learning.employe.operations.department.DeleteDepartmentOperation;
import com.learning.employe.operations.department.ReadAllDepartmentsOperation;
import com.learning.employe.operations.department.ReadDepartmentOperation;
import com.learning.employe.operations.department.ReadDepartmentsOperation;
import com.learning.employe.operations.department.UpdateDepartmentOperation;
import com.learning.employe.operations.employee.ReadByDepartmentOperation;
import com.learning.employe.service.DepartmentService;

@Controller
@RequestMapping("/api/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/list")
	public List<Department> display() {
		List<Department> dept = departmentService.getAllDepartments();
		return dept;
	}

	@GetMapping("/")
	public ModelAndView getAllDepartment() {
		return new ReadAllDepartmentsOperation().execute();
	}

	@GetMapping("/new")
	public ModelAndView addDepartment() {
		ModelAndView mav = new ModelAndView("add_department");
		mav.addObject("department", new Department());
		return mav;
	}

	@PostMapping("/save")
	public ModelAndView createDepartment(@Valid @ModelAttribute("department") Department department,
			BindingResult result) {
		return new CreateDepartmentOperation(department, result).execute();
	}

	@GetMapping("/{id}")
	public ModelAndView updateDepartmentById(@PathVariable("id") Long id) {
		return new ReadDepartmentOperation(id).execute();
	}

	@PostMapping("/update")
	public ModelAndView updateDepartment(@Valid @ModelAttribute("department") Department department, BindingResult result) {
		return new UpdateDepartmentOperation(department, result).execute();
	}

	@GetMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable("id") Long id) {
		return new DeleteDepartmentOperation(id).execute();
	}

	@GetMapping("/{id}/employees")
	public List<Employee> getDepartmentEmployees(@PathVariable("id") Long id) {
		return new ReadByDepartmentOperation(id).execute();
	}

	@GetMapping("/search")
	public ModelAndView search(@RequestParam("deptName") final String deptName) {
		return new ReadDepartmentsOperation(deptName).execute();
	}

}

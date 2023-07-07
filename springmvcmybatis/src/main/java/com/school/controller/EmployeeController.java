package com.school.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.bean.Employee;
import com.school.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	Employee employee = new Employee();
	ModelAndView mv = new ModelAndView();

	/* list all data in employee */
	@RequestMapping(value = "listEmployee", method = RequestMethod.GET)
	private ModelAndView listAllEmployeeData() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee employee = new Employee();
		list = employeeService.listEmployee(employee);
		mv.addObject("list", list);
		mv.setViewName("employee/list-employee");
		return mv;
	}

	/* show form insert employee page */
	@RequestMapping(value = "showEmployeePage")
	private ModelAndView showEmployeePageMethod() {
		mv.setViewName("employee/add-employee");
		return mv;
	}

	/* Save data into employee table in database */
	@RequestMapping(value = "saveEmployee", method = RequestMethod.POST)
	private ModelAndView saveEmployeeData(HttpServletRequest request) {
		employeeService.insertEmployee(request);
		return new ModelAndView("redirect:/listEmployee");
	}

	/* Show form update employee page */
	@RequestMapping(value = "goEditEmployee")
	private ModelAndView goEditEmployeePage(HttpServletRequest request) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		employee.setId(Integer.parseInt(request.getParameter("id")));
		list = employeeService.listEmployee(employee);
		mv.setViewName("employee/edit-employee");
		mv.addObject("list", list);
		return mv;
	}

	/* Updating and Save data to employee table in database */
	@RequestMapping(value = "updateEmployee", method = RequestMethod.POST)
	private ModelAndView updateEmployee(HttpServletRequest request) {
		employeeService.updateEmployee(request);
		return new ModelAndView("redirect:/listEmployee");
	}

	/* Delete Employee field */
	@RequestMapping(value = "deleteEmployee", method = RequestMethod.POST)
	private ModelAndView deleteEmployee(HttpServletRequest request) {
		employee.setId(Integer.parseInt(request.getParameter("id")));
		employeeService.deleteEmployee(request);
		mv.setViewName("employee/list-employee");
		return mv;
	}
}

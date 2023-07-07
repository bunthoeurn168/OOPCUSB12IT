package com.school.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.Employee;
import com.school.mapper.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;
	Employee employee = new Employee();

	/* list all employee */
	public ArrayList<Employee> listEmployee(Employee employee) {
		try {
			return employeeMapper.select(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/* insert employee */
	public void insertEmployee(HttpServletRequest request) {
		try {
			employee.setName(request.getParameter("name"));
			employee.setSalary(Float.parseFloat(request.getParameter("salary")));
			employeeMapper.insert(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Update employee */
	public void updateEmployee(HttpServletRequest request) {
		try {
			employee.setId(Integer.parseInt(request.getParameter("id")));
			employee.setName(request.getParameter("name"));
			employee.setSalary(Float.parseFloat(request.getParameter("salary")));
			employeeMapper.update(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Delete employee */
	public void deleteEmployee(HttpServletRequest request) {
		try {
			employee.setId(Integer.parseInt(request.getParameter("id")));
			employeeMapper.delete(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

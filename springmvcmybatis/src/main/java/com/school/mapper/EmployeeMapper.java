package com.school.mapper;

import java.util.ArrayList;

import com.school.bean.Employee;

public interface EmployeeMapper {
	public void insert(Employee employee);

	public void update(Employee employee);

	public void delete(Employee employee);

	public ArrayList<Employee> select(Employee employee);
}

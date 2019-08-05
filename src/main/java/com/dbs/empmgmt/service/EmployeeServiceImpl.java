package com.dbs.empmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dbs.empmgmt.dao.EmployeeDAO;
import com.dbs.empmgmt.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("h2Dao") EmployeeDAO employee)
	{
		this.employeeDAO=employee;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(employee);
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return this.employeeDAO.findAll();
	}

	@Override
	public Employee findById(long empId) {
		// TODO Auto-generated method stub
		return this.employeeDAO.findById(empId);
	}

	@Override
	public void deleteEmployee(long empId) {
		// TODO Auto-generated method stub
		 this.employeeDAO.deleteEmployee(empId);
		
	}
}

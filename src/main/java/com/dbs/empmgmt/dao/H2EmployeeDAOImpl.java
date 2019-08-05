package com.dbs.empmgmt.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dbs.empmgmt.model.Employee;

@Repository("h2Dao")
public class H2EmployeeDAOImpl implements EmployeeDAO{

	private JdbcTemplate jdbcTemplate;
	
	 public H2EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.execute("insert into employee (id) values("+employee.getId()+")");
		return employee;
	}

	@Override
	public Employee update(long empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
	}

}

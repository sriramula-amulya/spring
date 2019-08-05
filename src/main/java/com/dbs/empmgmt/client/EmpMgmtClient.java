package com.dbs.empmgmt.client;

import java.time.LocalDate;

import org.aspectj.weaver.ClassAnnotationValue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.empmgmt.controller.EmployeeController;
import com.dbs.empmgmt.model.Employee;

public class EmpMgmtClient {
	 private static  EmployeeController employeeController;

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        employeeController = applicationContext.getBean(EmployeeController.class);
        saveEmployees();
        listAllEmployees();
        fetchEmployeeDetailsById(12);

    }

    private static void fetchEmployeeDetailsById(int i) {
        System.out.println("Employee with id "+i +" is " +employeeController.findById(i));
    }

    private static void listAllEmployees() {
        employeeController.listAll().forEach(employee -> System.out.println(employee));
    }



    private static void saveEmployees(){
        Employee employee = new Employee(12,"Harish", LocalDate.of(1985,5, 25));
        employeeController.saveEmployee(employee);
        employee = new Employee(15,"VInayak", LocalDate.of(1985,6, 18));
        employeeController.saveEmployee(employee);
        employee = new Employee(12,"Harish", LocalDate.of(1981,3, 25));
        employeeController.saveEmployee(employee);
        employee = new Employee(35,"Amulya", LocalDate.of(1997,11,2));
        employeeController.saveEmployee(employee);
	}
}

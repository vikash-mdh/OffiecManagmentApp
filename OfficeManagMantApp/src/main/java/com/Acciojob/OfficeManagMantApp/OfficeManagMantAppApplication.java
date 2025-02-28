package com.Acciojob.OfficeManagMantApp;

import com.Acciojob.OfficeManagMantApp.Controller.EmployeeController;
import com.Acciojob.OfficeManagMantApp.Model.Employee;
import jakarta.el.BeanNameResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OfficeManagMantAppApplication {

	public static void main(String[] args) {

	  ApplicationContext context =  SpringApplication.run(OfficeManagMantAppApplication.class, args);

		// Get EmployeeController Bean from Spring
		EmployeeController employeeController = context.getBean(EmployeeController.class);

		// Create Employee and add it
		Employee employee = new Employee(123, "Vikash", 22, "CSE", 450000, "Male");
		employeeController.addEmployee(employee);






	}

}

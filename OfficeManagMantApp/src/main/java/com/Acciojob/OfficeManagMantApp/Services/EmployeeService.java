package com.Acciojob.OfficeManagMantApp.Services;


import com.Acciojob.OfficeManagMantApp.Model.Employee;
import com.Acciojob.OfficeManagMantApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
   @Autowired
   EmployeeRepository employeeRepository;


    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(int empId) {
        return employeeRepository.getEmployee(empId);

    }
    public void deleteEmployee(int empId) {
        employeeRepository.deleteEmployee(empId);
    }

    public Employee updateSalary(int empId, double newSalary) {
        return employeeRepository.updateSalary(empId,newSalary);
    }

    public Employee getHigestSalaryEmp() {
      return employeeRepository.getAllEmpoyees();

    }
}

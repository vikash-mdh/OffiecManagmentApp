package com.Acciojob.OfficeManagMantApp.repository;


import com.Acciojob.OfficeManagMantApp.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class EmployeeRepository {

    // hashmap my databases  is the local databases
    HashMap<Integer, Employee> empDB = new HashMap<>();

    public void addEmployee(Employee employee){
        empDB.put(employee.getEmpid(),employee);
    }

    public Employee getEmployee(int empId) {
        return empDB.get(empId);
    }

    public void deleteEmployee(int empId) {
        empDB.remove(empId);
    }

    public Employee updateSalary(int empId, double newSalary) {
        Employee employee = empDB.get(empId);
        employee.setSalary(newSalary);
        return employee;
    }

    public Employee getAllEmpoyees() {
        double maxSalary = 0;
        Employee highestPaidEmp = null;

        for(int empId : empDB.keySet()){
            Employee currEmp = empDB.get(empId);
            if(currEmp.getSalary() > maxSalary){
                maxSalary = currEmp.getSalary();
                highestPaidEmp = currEmp;
            }
        }
        return highestPaidEmp;
    }

}

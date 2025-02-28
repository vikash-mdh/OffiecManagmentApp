package com.Acciojob.OfficeManagMantApp.Controller;

import com.Acciojob.OfficeManagMantApp.Model.Employee;
import com.Acciojob.OfficeManagMantApp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

     // This is the post api call function
     // this is the postmapping it is the insert the values in the post api
    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee Registered Successfully";
    }

     // this is the get api code
     @GetMapping("/get-employee")  // This is the getMapping in the get-Employee in this anotaion  is find the get-employee
    public Employee getEmployee(@RequestParam("id") int empId){
        return employeeService.getEmployee(empId);
    }

    // This is called delete api
    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee( @PathVariable("id") int empId){
        employeeService.deleteEmployee(empId);
        return "Employee delete Succesfully";
    }

    // update the salary if the employee  -> empId ,newSalary

    @PutMapping("/update-salary")
    public Employee updateSalary(@RequestParam("id") int empId,
                                 @RequestParam("new-salary") double newSalary){
        return employeeService.updateSalary(empId, newSalary);

    }

    // find the HigestSalary in the all employee

    @GetMapping("/get-higest-salary")
    public Employee getHigestSalaryEmp(){
        return employeeService.getHigestSalaryEmp();

    }


    
}

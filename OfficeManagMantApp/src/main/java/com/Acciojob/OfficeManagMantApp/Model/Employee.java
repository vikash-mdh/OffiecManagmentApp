package com.Acciojob.OfficeManagMantApp.Model;

public class Employee {
    private int empid;
    private String name;
    private int age;
    private String department;
    private double salary;
    private String gender;


    public Employee() {

    }

    public Employee(int empid,
                    String name,
                    int age,
                    String department,
                    float salary,
                    String gender) {
        this.empid = empid;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

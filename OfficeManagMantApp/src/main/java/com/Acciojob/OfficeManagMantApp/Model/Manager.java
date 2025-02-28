package com.Acciojob.OfficeManagMantApp.Model;

public class Manager {
   private int manager_id;
   private String name;
   private int age;
   private int numberOfReports;
   private String department;
   private String gender;

   // this is the normal constructor
    public Manager() {

    }

    public Manager(int manager_id,
                   String name,
                   int age,
                   int numberOfReports,
                   String department,
                   String gender) {
        this.manager_id = manager_id;
        this.name = name;
        this.age = age;
        this.numberOfReports = numberOfReports;
        this.department = department;
        this.gender = gender;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
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

    public int getNumberOfReports() {
        return numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

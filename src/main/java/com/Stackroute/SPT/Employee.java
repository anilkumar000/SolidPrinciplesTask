package com.Stackroute.SPT;

public class Employee {
    private int employeeID;
    private String name;
    private String designation;


    public Employee(){}


    public Employee(int employeeID, String name, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}

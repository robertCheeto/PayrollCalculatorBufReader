package com.pluralsight;

public class Employee {
    private int employeeID;
    private String employeeName;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeID, double payRate, double hoursWorked, String employeeName) {
        this.employeeID = employeeID;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                '}';
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getGrossSalary() {
        double grossSalary = this.hoursWorked * this.payRate;
        return grossSalary;
    }

}

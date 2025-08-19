package com.madanraj.assignment.utilities;

import com.madanraj.assignment.employees.Employee;

public class EmployeeUtilities {

    
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary updated for " + employee.getName() + ": " + newSalary);
    }

    public static void showEmployeeDetails(Employee employee) {
        employee.displayInfo();
    }
}
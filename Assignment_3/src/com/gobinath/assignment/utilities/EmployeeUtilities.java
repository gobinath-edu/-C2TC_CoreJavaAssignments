
package com.gobinath.assignment.utilities;

import com.gobinath.assignment.employees.Employee;

/**
 * Utility class for Employee-related operations.
 */
public class EmployeeUtilities {

    public static void displayEmployee(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }
}

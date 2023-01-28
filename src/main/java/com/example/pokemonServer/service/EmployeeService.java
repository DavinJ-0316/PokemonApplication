// Java Program to Demonstrate DepartmentService File

// Importing required package modules
package com.example.pokemonServer.service;
import com.example.pokemonServer.entity.Employee;
// Importing required classes
import java.util.List;

// Interface
public interface EmployeeService {

    // Save operation
    Employee saveEmployee(Employee employee);

    // Read operation
    List<Employee> fetchEmployeeList();

    // Update operation
    Employee updateEmployee(Employee employee,
                                Long employeeId);

    // Delete operation
    void deleteEmployeeById(Long employeeId);
}

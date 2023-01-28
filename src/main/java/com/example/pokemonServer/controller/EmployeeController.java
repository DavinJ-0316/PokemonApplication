// java Program to Illustrate DepartmentController File

// Importing required packages modules
package com.example.pokemonServer.controller;

import com.example.pokemonServer.entity.Employee;
import com.example.pokemonServer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Annotation
@RestController

// Class
public class EmployeeController {

    @Autowired private EmployeeService employeeService;

    // Save operation
    @PostMapping("/employees")
    public Employee saveDepartment(
            @RequestBody Employee employee)
    {
        System.out.println(employee);
        return employeeService.saveEmployee(employee);
    }

    // Read operation
    @GetMapping("/employees")
    public List<Employee> fetchDepartmentList()
    {
        return employeeService.fetchEmployeeList();
    }

//    // Update operation
//    @PutMapping("/departments/{id}")
//    public Department
//    updateDepartment(@RequestBody Department department,
//                     @PathVariable("id") Long departmentId)
//    {
//        return departmentService.updateDepartment(
//                department, departmentId);
//    }
//
//    // Delete operation
//    @DeleteMapping("/departments/{id}")
//    public String deleteDepartmentById(@PathVariable("id")
//                                       Long departmentId)
//    {
//        departmentService.deleteDepartmentById(
//                departmentId);
//        return "Deleted Successfully";
//    }
}

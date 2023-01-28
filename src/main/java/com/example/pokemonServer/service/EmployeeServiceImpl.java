// Java Program to Demonstrate DepartmentServiceImpl.java
// File

// Importing required package modules
package com.example.pokemonServer.service;

import com.example.pokemonServer.entity.Employee;
import com.example.pokemonServer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

// Annotation
@Service

// Class
public class EmployeeServiceImpl
        implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Save operation
    @Override
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    // Read operation
    @Override
    public List<Employee> fetchEmployeeList()
    {
        return (List<Employee>)
                employeeRepository.findAll();
    }

    // Update operation
    @Override
    public Employee
    updateEmployee(Employee employee,
                     Long employeeId)
    {
        Employee depDB
                = employeeRepository.findById(employeeId)
                .get();

        if (Objects.nonNull(employee.getFirstName())
                && !"".equalsIgnoreCase(
                employee.getFirstName())) {
            depDB.setFirstName(
                    employee.getFirstName());
        }

//        if (Objects.nonNull(
//                employee.getEmail())
//                && !"".equalsIgnoreCase(
//                department.getDepartmentAddress())) {
//            depDB.setDepartmentAddress(
//                    department.getDepartmentAddress());
//        }
//
//        if (Objects.nonNull(department.getDepartmentCode())
//                && !"".equalsIgnoreCase(
//                department.getDepartmentCode())) {
//            depDB.setDepartmentCode(
//                    department.getDepartmentCode());
//        }

        return employeeRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteEmployeeById(Long employeeId)
    {
        employeeRepository.deleteById(employeeId);
    }
}

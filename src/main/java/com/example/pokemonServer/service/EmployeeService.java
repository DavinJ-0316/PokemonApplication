// Java Program to Demonstrate DepartmentServiceImpl.java
// File

// Importing required package modules
package com.example.pokemonServer.service;

import com.example.pokemonServer.dto.employee.EmployeeGetDto;
import com.example.pokemonServer.dto.employee.EmployeePostDto;
import com.example.pokemonServer.entity.Employee;
import com.example.pokemonServer.mapper.EmployeeMapper;
import com.example.pokemonServer.repository.EmployeeRepository;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Annotation
// https://stackoverflow.com/questions/59598779/variable-not-initialized-in-default-constructor
// should add annotationProcessorPath
// I had the same issue and it appears I haven't added the annotationProcessorPath to lombok during it's installation, similar to what @runnerpaul mentioned.
// java: variable employeeRepository not initialized in the default constructor
@RequiredArgsConstructor
@Service
// Class
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    // Read operation
    public List<EmployeeGetDto> fetchEmployeeList() {
//        System.out.println("why null: " + employeeRepository.findAll().stream().forEach(s -> System.out.println(s));
//                .map(employee ->
//                        employeeMapper.fromEntity(employee))
//                .collect(Collectors.toList()));

        employeeRepository.findAll().stream().forEach(s -> System.out.println(new Gson().toJson(s)));
        employeeRepository.findAll().stream().forEach(s -> System.out.println(new Gson().toJson(employeeMapper.fromEntity(s))));

        return employeeRepository.findAll().stream()
                        .map(employee -> employeeMapper.fromEntity(employee))
                        .collect(Collectors.toList());
    }

    public EmployeeGetDto addNewEmployee(EmployeePostDto employeePostDto) {
        System.out.println("before translate: " + employeePostDto);
        System.out.println("after translate: " + employeeMapper.toEntity(employeePostDto));
        System.out.println(new Gson().toJson(employeeMapper.toEntity(employeePostDto)));
        Employee employee = employeeRepository.save(employeeMapper.toEntity(employeePostDto));
        return employeeMapper.fromEntity(employee);
    }
}

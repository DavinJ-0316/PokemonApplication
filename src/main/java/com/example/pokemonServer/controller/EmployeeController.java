// java Program to Illustrate DepartmentController File

// Importing required packages modules
package com.example.pokemonServer.controller;

import com.example.pokemonServer.dto.employee.EmployeeGetDto;
import com.example.pokemonServer.dto.employee.EmployeePostDto;
import com.example.pokemonServer.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@Slf4j
// Class
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public ResponseEntity<List<EmployeeGetDto>> getAllEmployees() {
        log.debug("controller getAllEmployees() started");
        System.out.println("controller getAllEmployees() started" + employeeService.fetchEmployeeList());
        return ResponseEntity.ok(employeeService.fetchEmployeeList());
    }

    @PostMapping
    public ResponseEntity<EmployeeGetDto> createEmployee(@RequestBody EmployeePostDto employeePostDto) {
        log.debug("controller createEmployee() started");
        System.out.println("controller createEmployee() started" + employeePostDto);
        EmployeeGetDto employeeGetDto = employeeService.addNewEmployee(employeePostDto);
        return ResponseEntity.ok(employeeGetDto);
    }


}

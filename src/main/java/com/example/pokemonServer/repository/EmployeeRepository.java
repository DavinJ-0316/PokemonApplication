package com.example.pokemonServer.repository;

import com.example.pokemonServer.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface extending CrudRepository
public interface EmployeeRepository
        extends CrudRepository<Employee, Long> {
}

package com.example.pokemonServer.mapper;

import com.example.pokemonServer.dto.employee.EmployeeGetDto;
import com.example.pokemonServer.dto.employee.EmployeePostDto;
import com.example.pokemonServer.entity.Employee;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-25T16:14:22+1100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.5 (Azul Systems, Inc.)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeGetDto fromEntity(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeGetDto employeeGetDto = new EmployeeGetDto();

        return employeeGetDto;
    }

    @Override
    public Employee toEntity(EmployeePostDto employeePostDto) {
        if ( employeePostDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        return employee;
    }
}

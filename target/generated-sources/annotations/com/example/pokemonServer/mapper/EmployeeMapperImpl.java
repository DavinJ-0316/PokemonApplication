package com.example.pokemonServer.mapper;

import com.example.pokemonServer.dto.employee.EmployeeGetDto;
import com.example.pokemonServer.dto.employee.EmployeePostDto;
import com.example.pokemonServer.entity.Employee;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-06T15:50:28+1000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeGetDto fromEntity(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeGetDto employeeGetDto = new EmployeeGetDto();

        employeeGetDto.setId( employee.getId() );
        employeeGetDto.setFirstName( employee.getFirstName() );
        employeeGetDto.setLastName( employee.getLastName() );
        employeeGetDto.setEmail( employee.getEmail() );

        return employeeGetDto;
    }

    @Override
    public Employee toEntity(EmployeePostDto employeePostDto) {
        if ( employeePostDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setFirstName( employeePostDto.getFirstName() );
        employee.setLastName( employeePostDto.getLastName() );
        employee.setEmail( employeePostDto.getEmail() );

        return employee;
    }
}

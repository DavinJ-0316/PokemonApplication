package com.example.pokemonServer.mapper;

import com.example.pokemonServer.dto.employee.EmployeeGetDto;
import com.example.pokemonServer.dto.employee.EmployeePostDto;
import com.example.pokemonServer.entity.Employee;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-12T11:13:50+1100",
    comments = "version: 1.4.0.Beta1, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
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

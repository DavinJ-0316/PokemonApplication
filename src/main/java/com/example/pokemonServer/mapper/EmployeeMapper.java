package com.example.pokemonServer.mapper;

import com.example.pokemonServer.dto.employee.EmployeeGetDto;
import com.example.pokemonServer.dto.employee.EmployeePostDto;
import com.example.pokemonServer.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

// for mapper error:
// IntelliJ Idea mapstruct java: Internal error in the mapping processor: java.lang.NullPointerException
// https://stackoverflow.com/questions/65112406/intellij-idea-mapstruct-java-internal-error-in-the-mapping-processor-java-lang
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {

    //to create an instance of a mapper in MapStruct, why ticktacktoe no need to create an instance of a mapper in MapStruct?
    //EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    EmployeeGetDto fromEntity (Employee employee);

    Employee toEntity (EmployeePostDto employeePostDto);


    
}

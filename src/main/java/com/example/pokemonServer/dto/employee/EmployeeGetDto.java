package com.example.pokemonServer.dto.employee;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeGetDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

package com.example.pokemonServer.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class EmployeePostDto {
    private String firstName;
    private String lastName;
    private String email;
}

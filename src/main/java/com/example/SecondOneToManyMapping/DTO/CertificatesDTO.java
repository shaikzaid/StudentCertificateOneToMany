package com.example.SecondOneToManyMapping.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class CertificatesDTO {
    private Long id;
    private String name;
    @JsonIgnore
    private StudentDTO student;
}

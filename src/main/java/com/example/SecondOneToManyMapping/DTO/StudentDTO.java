package com.example.SecondOneToManyMapping.DTO;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private List<CertificatesDTO> certificatesList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<CertificatesDTO> getCertificatesList() {
        return certificatesList;
    }

    public void setCertificatesList(List<CertificatesDTO> certificatesList) {
        this.certificatesList = certificatesList;
    }
}

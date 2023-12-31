package com.example.SecondOneToManyMapping.DTO;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String LastName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Student_id")
    private List<Certificates> certificatesList;




    //GetterAndSetter
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
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public List<Certificates> getCertificatesList() {
        return certificatesList;
    }

    public void setCertificatesList(List<Certificates> certificatesList) {
        this.certificatesList = certificatesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", certificatesList=" + certificatesList +
                '}';
    }
}

package com.example.SecondOneToManyMapping.DAO;

import com.example.SecondOneToManyMapping.DTO.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student , Long> {
}

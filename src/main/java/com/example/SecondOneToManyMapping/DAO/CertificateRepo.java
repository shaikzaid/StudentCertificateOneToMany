package com.example.SecondOneToManyMapping.DAO;

import com.example.SecondOneToManyMapping.DTO.Certificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepo extends JpaRepository<Certificates,Long> {
}

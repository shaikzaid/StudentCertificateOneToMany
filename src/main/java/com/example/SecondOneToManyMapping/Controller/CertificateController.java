package com.example.SecondOneToManyMapping.Controller;

import com.example.SecondOneToManyMapping.DTO.Certificates;
import com.example.SecondOneToManyMapping.DTO.Student;
import com.example.SecondOneToManyMapping.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/StC")
public class CertificateController {
    @Autowired
   private CertificateService certificateService;
    @PostMapping
    public ResponseEntity<Certificates> saveCertificate(@RequestBody Certificates certificates){
     certificateService.saveCertificate(certificates);
     return new ResponseEntity<>(certificates, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Certificates> getCertificateById(@PathVariable Long id){
    Certificates certificates1= certificateService.getCertificateById(id);
        return new ResponseEntity<>(certificates1, HttpStatus.CREATED);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<List<Certificates>> getAllCertificateOfEmployee(@PathVariable Long id){
        List<Certificates> certificates1=certificateService.getAllCertificateByStudentId(id);
       return new ResponseEntity<>(certificates1,HttpStatus.OK);
    }
    @PutMapping("/employee/{id}")
    public ResponseEntity<Certificates> updateCertificate(@PathVariable Long id, @RequestBody Certificates certificates){
       Certificates certificates1=certificateService.updateCertificate(id,certificates);
       return new ResponseEntity<>(certificates1,HttpStatus.CREATED);
    }
}

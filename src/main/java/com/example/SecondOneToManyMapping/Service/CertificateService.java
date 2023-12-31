package com.example.SecondOneToManyMapping.Service;

import com.example.SecondOneToManyMapping.DAO.CertificateRepo;
import com.example.SecondOneToManyMapping.DAO.StudentRepo;
import com.example.SecondOneToManyMapping.DTO.Certificates;
import com.example.SecondOneToManyMapping.DTO.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {
    @Autowired
    CertificateRepo certificateRepo;
    @Autowired
    StudentRepo studentRepo;

    public Certificates saveCertificate(Certificates certificate){
//        Student student1= studentRepo.getReferenceById(id);
//         certificate.setStudent(student1);
         return certificateRepo.save(certificate);
    }

    public Certificates getCertificateById(Long id){
         return certificateRepo.getReferenceById(id);
    }
    public List<Certificates> getAllCertificateByStudentId(Long id){
        Student student=studentRepo.getReferenceById(id);
       return student.getCertificatesList();
//return certificateRepo.findAll();
    }

    public Certificates updateCertificate(Long id,Certificates certificate){
     Certificates certificates=certificateRepo.getReferenceById(id);
     if(certificates!=null){
         certificates.setName(certificates.getName());
     }
     return certificateRepo.save(certificates);
    }
    public void deleteCertificate(Long id){
     certificateRepo.deleteById(id);
    }
    public void deleteAllStudent(){
      certificateRepo.deleteAll();
    }

}

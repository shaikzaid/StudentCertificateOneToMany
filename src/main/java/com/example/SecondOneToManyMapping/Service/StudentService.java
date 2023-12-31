package com.example.SecondOneToManyMapping.Service;

import com.example.SecondOneToManyMapping.DAO.StudentRepo;
import com.example.SecondOneToManyMapping.DTO.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student  student){
      return studentRepo.save(student);
    }

    public Optional<Student> getStudentById(Long id){

        return studentRepo.findById(id);
    }

    public List<Student> getAllStudent(){
       return studentRepo.findAll();
    }

    public Student updateStudent(Long id,Student student){
    Optional<Student> student1=studentRepo.findById(id);
    Student student2=null;
    if(student1 != null){
        student2.setFirstName(student.getFirstName());
        student2.setLastName(student.getLastName());
    }
    return studentRepo.save(student2);
    }

    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }
    public void deleteAllStudent(){
       studentRepo.deleteAll();
    }
}

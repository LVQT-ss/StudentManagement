package com.studentapp.application.service.IMPL;

import com.studentapp.application.dto.StudentDTO;
import com.studentapp.application.dto.StudentSaveDTO;
import com.studentapp.application.entity.Student;
import com.studentapp.application.repository.StudentRepo;
import com.studentapp.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentIMPL implements StudentService {

    @Autowired
    private StudentRepo  studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(
                studentSaveDTO.getStudentname(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getMobile(),
                studentSaveDTO.isActive()

        );

        studentRepo.save(student);

        return student.getStudentname();
    }

    @Override
    public List<StudentDTO> getStudent(){

        List<Student> getStudents = studentRepo.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();

        for (Student s :getStudents) {
            StudentDTO studentDTO = new StudentDTO(
                    s.getStudentid(),
                    s.getStudentname(),
                    s.getAddress(),
                    s.getMobile(),
                    s.isActive()
            );
            studentDTOList.add(studentDTO);
        }
        return studentDTOList;
    }

    @Override
    public String updateStudent(StudentDTO studentDTO) {

        if(studentRepo.existsById(studentDTO.getStudentid())) {

            Student student = studentRepo.getById(studentDTO.getStudentid());

            student.setStudentname(studentDTO.getStudentname());
            student.setAddress(studentDTO.getAddress());
            student.setMobile(studentDTO.getMobile());
            student.setActive(studentDTO.isActive());
            studentRepo.save(student);
        }
        else
        {
            System.out.println("Student ID no Exist");
        }
        return null;
    }

}

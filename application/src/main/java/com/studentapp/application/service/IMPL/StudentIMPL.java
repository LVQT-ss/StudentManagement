package com.studentapp.application.service.IMPL;

import com.studentapp.application.dto.StudentSaveDTO;
import com.studentapp.application.entity.Student;
import com.studentapp.application.repository.StudentRepo;
import com.studentapp.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentIMPL implements StudentService {

    @Autowired
    private StudentRepo  studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(
                studentSaveDTO.getStudentname(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getPhone(),
                studentSaveDTO.isActive()

        );

        studentRepo.save(student);

        return student.getStudentname();
    }


}

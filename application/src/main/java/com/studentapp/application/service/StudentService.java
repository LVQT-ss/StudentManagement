package com.studentapp.application.service;


import com.studentapp.application.dto.StudentDTO;
import com.studentapp.application.dto.StudentSaveDTO;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);
    List<StudentDTO> getStudent();

    String updateStudent(StudentDTO studentDTO);


}

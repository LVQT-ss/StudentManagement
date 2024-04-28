package com.studentapp.application.controller;

import com.studentapp.application.dto.StudentDTO;
import com.studentapp.application.dto.StudentSaveDTO;
import com.studentapp.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/add")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO){
        String id = studentService.addStudent(studentSaveDTO);
        return id;
    }


    @GetMapping(path = "/get")
    public List<StudentDTO> getStudent(){

        List<StudentDTO> allStudents = studentService.getStudent();
        return allStudents;
    }

}

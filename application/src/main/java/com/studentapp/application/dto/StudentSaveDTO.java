package com.studentapp.application.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSaveDTO {


    private int studentid;
    private String studentname;
    private String address;
    private int phone;
    private boolean active;

}

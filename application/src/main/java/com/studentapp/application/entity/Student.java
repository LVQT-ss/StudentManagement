package com.studentapp.application.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="student")
public class Student {

    @Id
    @jakarta.persistence.Id
    @Column(name="student_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;

    @Column(name="student_name", length = 50)
    private String studentname;

    @Column(name="address", length = 100)
    private String address;

    @Column(name="phone", length = 50)
    private int phone;

    @Column(name="active", columnDefinition = "TINYINT default 1")
    private boolean active;



    public Student(int studentid, String studentname, String address, int phone, boolean active) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.address = address;
        this.phone = phone;
        this.active = active;
    }


    public Student() {}

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", active=" + active +
                '}';
    }


}

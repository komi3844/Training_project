package ru.mmtr.training.Training_project.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentid;

    @OneToOne
    @JoinColumn(name = "idpractice")
    private Practice practice;

    @OneToOne
    private Request request;

//
//    @OneToOne
//    @JoinColumn(name = "idfaculty")
//    private Faculty faculty;
//
//    @OneToOne
//    @JoinColumn(name = "iduniversity")
//    private University university;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;
    @Column(name = "middlename")
    private String middlename;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "gender")
    private char gender;
    @Column(name = "phone")
    private int phone;
    @Column(name = "status")
    private String status;

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

package ru.mmtr.training.Training_project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentid;
    private long idpractice;
    private long idpfaculty;
    private long iduniversity;
    private String name;

    private String surname;
    private String middlename;
    private LocalDate birthday;
    private char gender;
    private int phone;
    private String status;
    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public long getIdpractice() {
        return idpractice;
    }

    public void setIdpractice(long idpractice) {
        this.idpractice = idpractice;
    }

    public long getIdpfaculty() {
        return idpfaculty;
    }

    public void setIdpfaculty(long idpfaculty) {
        this.idpfaculty = idpfaculty;
    }

    public long getIduniversity() {
        return iduniversity;
    }

    public void setIduniversity(long iduniversity) {
        this.iduniversity = iduniversity;
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

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
}

package ru.mmtr.training.Training_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mmtr.training.Training_project.dao.imp.StudentDAOimp;
import ru.mmtr.training.Training_project.service.StudentService;

import java.sql.SQLException;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping(value = "student")
    public StudentService getStudent (){
        StudentService studentService = new StudentService();
        try {
            return (StudentService) studentService.getallStudent();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
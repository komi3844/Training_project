package ru.mmtr.training.Training_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mmtr.training.Training_project.entity.Student;
import ru.mmtr.training.Training_project.service.IStudentService;
import ru.mmtr.training.Training_project.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping(value = "student")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
    }
}
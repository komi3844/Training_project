package ru.mmtr.training.Training_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.mmtr.training.Training_project.entity.Student;
import ru.mmtr.training.Training_project.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping(value = "allstudent")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
    }

    @PostMapping(value = "addstudent")
    public ResponseEntity<Void> addStudent(@RequestBody Student student, UriComponentsBuilder builder) {
        boolean flag = studentService.addStudent(student);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/student/{id}").buildAndExpand(student.getStudentid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping("student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentid) {
        Student student = studentService.getStudentById(studentid);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @PutMapping("updstudent")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @DeleteMapping("delstudent/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
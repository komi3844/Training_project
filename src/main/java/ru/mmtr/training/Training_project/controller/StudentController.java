package ru.mmtr.training.Training_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.mmtr.training.Training_project.dto.StudentDTO;
import ru.mmtr.training.Training_project.entity.Student;
import ru.mmtr.training.Training_project.model.StudentModel;
import ru.mmtr.training.Training_project.service.IStudentService;
import ru.mmtr.training.Training_project.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "allstudent")
    public ResponseEntity<List<StudentDTO>> getAllStudent() {
        List<StudentDTO> list = studentService.getAllStudent();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping(value = "addstudent")
    public ResponseEntity<Void> addStudent(@RequestBody Student student, UriComponentsBuilder builder) {
        boolean flag = studentService.addStudent(student);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT); //Доработать моделька generalrespons
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/student/{id}").buildAndExpand(student.getStudentid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping("/{studentid}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable("id") StudentDTO studentid) {
        StudentDTO student = studentService.getStudentById(studentid);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("updstudent")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @DeleteMapping("{studentid}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
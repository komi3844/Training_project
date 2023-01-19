package ru.mmtr.training.Training_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping(value = "student")
    public String hellostudent(){
        String s = "Hello student";
        return s;
    }
}

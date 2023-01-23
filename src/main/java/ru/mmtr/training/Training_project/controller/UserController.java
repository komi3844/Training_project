package ru.mmtr.training.Training_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "user")
    public String hellouser(){
        String s = "Hello user";
        return s;
    }
}
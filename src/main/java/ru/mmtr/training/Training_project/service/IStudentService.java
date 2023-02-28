package ru.mmtr.training.Training_project.service;

import org.springframework.stereotype.Service;
import ru.mmtr.training.Training_project.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudent();
    boolean addStudent(Student student);
}

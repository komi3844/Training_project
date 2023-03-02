package ru.mmtr.training.Training_project.service;

import ru.mmtr.training.Training_project.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudent();

    boolean addStudent(Student student);

    Student getStudentById(long studentid);

    void updateStudent(Student student);

    void deleteStudent(long studentid);
}

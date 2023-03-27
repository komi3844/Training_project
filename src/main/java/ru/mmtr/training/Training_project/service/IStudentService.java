package ru.mmtr.training.Training_project.service;

import ru.mmtr.training.Training_project.dto.StudentDTO;
import ru.mmtr.training.Training_project.entity.Student;

import java.util.List;

public interface IStudentService {
    List<StudentDTO> getAllStudent();

    boolean addStudent(Student student);

    StudentDTO getStudentById(StudentDTO studentid);

    void updateStudent(Student student);

    void deleteStudent(long studentid);
}

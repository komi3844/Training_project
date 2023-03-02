package ru.mmtr.training.Training_project.dao;


import java.util.List;
import ru.mmtr.training.Training_project.entity.Student;

public interface StudentDAO {
    List<Student> getAllStudent();

    void addStudent(Student student);

    boolean studentExists(long studentid); // Проверка, есть ли id студента (поменять потом!!!!)

    Student getStudentById(long studentid);

    void updateStudent(Student student);

    void deleteStudent(long studentid);

}

package ru.mmtr.training.Training_project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mmtr.training.Training_project.dao.StudentDAO;
import ru.mmtr.training.Training_project.entity.Student;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }

    @Override
    public boolean addStudent(Student student) {
        if (studentDAO.studentExists(student.getStudentid())) {
            return false;
        } else {
            studentDAO.addStudent(student);
            return true;
        }
    }
}



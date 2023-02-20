package ru.mmtr.training.Training_project.service;


import org.springframework.beans.factory.annotation.Autowired;
import ru.mmtr.training.Training_project.dao.StudentDAO;
import ru.mmtr.training.Training_project.dao.imp.StudentDAOimp;
import ru.mmtr.training.Training_project.entity.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService implements IStudentService{
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }
}

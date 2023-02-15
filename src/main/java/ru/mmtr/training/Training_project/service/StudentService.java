package ru.mmtr.training.Training_project.service;


import ru.mmtr.training.Training_project.dao.imp.StudentDAOimp;
import ru.mmtr.training.Training_project.entity.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService{
    private StudentDAOimp studentDAOimp = new StudentDAOimp();

    public List<Student> getallStudent() throws SQLException {
        return studentDAOimp.getall();
    }
}

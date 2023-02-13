package ru.mmtr.training.Training_project.dao;


import ru.mmtr.training.Training_project.entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    //create
    void add(Student student) throws SQLException;

    //read
    List<Student> getall() throws SQLException;

    //update
    void update(Student student) throws SQLException;

    //delete
    void remove(Student student) throws SQLException;
}

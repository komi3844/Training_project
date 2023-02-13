package ru.mmtr.training.Training_project.dao;

import ru.mmtr.training.Training_project.entity.Faculty;

import java.sql.SQLException;
import java.util.List;

public interface FacultyDAO {
    //create
    void add(Faculty faculty) throws SQLException;

    //read
    List<Faculty> getall() throws SQLException;

    //update
    void update(Faculty faculty) throws SQLException;

    //delete
    void remove(Faculty faculty) throws SQLException;
}

package ru.mmtr.training.Training_project.dao;

import ru.mmtr.training.Training_project.entity.Grade;

import java.sql.SQLException;
import java.util.List;

public interface GradeDAO {
    //create
    void add(Grade faculty) throws SQLException;

    //read
    List<Grade> getall() throws SQLException;

    //update
    void update(Grade faculty) throws SQLException;

    //delete
    void remove(Grade faculty) throws SQLException;
}
